package com.library.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.library.main.CheckedOutItems;
import com.library.model.CheckOut;
import com.library.model.DVD;
import com.library.model.LibraryBook;
import com.library.repositories.CheckOutRepository;
import com.library.repositories.DVDRepository;
import com.library.repositories.LibraryBookRepository;

@Controller
public class LogOutController {

	@Autowired
	private LibraryBookRepository libraryBookRepository;

	@Autowired
	private CheckOutRepository checkOutRepository;

	@Autowired
	private DVDRepository dvdRepository;
	//Removing user from session.
	@RequestMapping("/Logout")
	public String logOut(HttpSession session) {
		session.removeAttribute("username");
		session.removeAttribute("userid");
		session.removeAttribute("usertype");

		return "home.jsp";
	}
	//Checking out the Books & DVD's.
	@RequestMapping("/ItemsDue")
	public String ItemsDue(ModelMap model, HttpSession session) {
		List<CheckedOutItems> checkedOutItems = new ArrayList<CheckedOutItems>();
		List<CheckOut> checkoutList = checkOutRepository.findAll();
		String tmp = (String) session.getAttribute("userid");
		for (CheckOut l : checkoutList) {
			if (l.getUsername().equals(tmp)) {
				CheckedOutItems co = new CheckedOutItems();
				if (l.getType().equals("Book")) {
					co.setiSBN(l.getISBN());
					LibraryBook bk = libraryBookRepository.getOne(l.getISBN());
					co.setDueDate(l.getDueDate());
					co.setTitle(bk.getbTitle());
					co.setType("Book");
					co.setUsername(tmp);
					co.setImgSource(bk.getImgSrc());
					checkedOutItems.add(co);

				} else {
					System.out.println("the value of l.getdTtile()" + l.getdTitle());
					co.setTitle(l.getdTitle());
					co.setType("DVD");
					co.setUsername(tmp);
					DVD d = dvdRepository.getOne(l.getdTitle());
					co.setDueDate(l.getDueDate());
					co.setImgSource(d.getImgSource());
					checkedOutItems.add(co);
					
				}

			}
		}
		session.setAttribute("chlist", checkedOutItems);

		return "ItemsDue.jsp";
	}

	//Opens contact page.
	@RequestMapping(value = "/Contact", method = RequestMethod.GET)
	public String Contact() {
		System.out.println("Hello World - Contact");
		return "Contact.jsp";

	}
}
