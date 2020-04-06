package com.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.library.model.DVD;
import com.library.model.LibraryBook;
import com.library.model.Magazine;
import com.library.repositories.DVDRepository;
import com.library.repositories.LibraryBookRepository;
import com.library.repositories.MagazineRepository;

@Controller
public class AdminController {

	@Autowired
	private LibraryBookRepository libraryBookRepository;

	@Autowired
	private DVDRepository dvdRepository;

	@Autowired
	private MagazineRepository magazineRepository;

	@RequestMapping("Admin")
	public String addBook() {
		return "AdminBook.jsp";
	}

	@RequestMapping("/addbook")
	public String showNewBookForm(Model model) {

		return "NewBook.jsp";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveBook1(@RequestParam String bookimage, @RequestParam String bTitle, @RequestParam long iSBN,
			@RequestParam String bookAuthor, @RequestParam int copies, @RequestParam String bookillustrator) {

		libraryBookRepository.save(new LibraryBook(iSBN, bookimage, bTitle, bookAuthor, copies, bookillustrator));

		return "/addbook";
	}

	@RequestMapping("/addDvd")
	public String showNewDVDForm(Model model) {

		return "NewDVD.jsp";
	}

	@RequestMapping(value = "/savedvd", method = RequestMethod.POST)
	public String saveDvd(@RequestParam String dTitle,@RequestParam String imgSource, @RequestParam String dAuthor, @RequestParam int dcopies,
			@RequestParam String vRating) {

		dvdRepository.save(new DVD(dTitle,imgSource, dAuthor, dcopies, vRating));
		return "NewDVD.jsp";

	}

	@RequestMapping("/addmagazine")
	public String showNewMagazineForm(Model model) {

		return "NewMagazine.jsp";
	}

	@RequestMapping(value = "/savemagazine", method = RequestMethod.POST)
	public String saveMagazine(@RequestParam String mTitle, @RequestParam String mImage,
			@RequestParam String mPublisher, @RequestParam int mcopies, @RequestParam String mRating) {

		magazineRepository.save(new Magazine(mTitle, mImage, mPublisher, mcopies, mRating));

		return "NewMagazine.jsp";

	}

}