package com.library.controller;

import java.util.Calendar;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.library.model.CheckOut;
import com.library.model.DVD;
import com.library.model.Hold;
import com.library.model.LibraryBook;
import com.library.model.Magazine;
import com.library.repositories.CheckOutRepository;
import com.library.repositories.DVDRepository;
import com.library.repositories.HoldRepository;
import com.library.repositories.LibraryBookRepository;
import com.library.repositories.MagazineRepository;

@Controller
public class LibraryMainController {

	@Autowired
	private LibraryBookRepository libraryBookRepository;

	@Autowired
	private DVDRepository dvdRepository;

	@Autowired
	private CheckOutRepository checkOutRepository;

	@Autowired
	private HoldRepository holdRepository;

	@Autowired
	private MagazineRepository magazineRepository;

	// User can choose Books, DVDs & Magazines to check out.
	@RequestMapping(value = "/Search", method = RequestMethod.POST)
	public String DisplayBook(@RequestParam String searchoption, ModelMap model) throws Exception {

		if (searchoption.equals("BOOK")) {
			System.out.println("Hello World - Searching for books)");
			List<LibraryBook> bookList = libraryBookRepository.findAll();
			model.addAttribute("books", bookList);
			return "book.jsp";
		}

		if (searchoption.equals("DVD")) {
			System.out.println("Hello World - Searching for DVDs)");
			List<DVD> dvdList = dvdRepository.findAll();
			model.addAttribute("dvds", dvdList);
			return "dvd.jsp";
		}
		if (searchoption.equals("MAGAZINE")) {
			System.out.println("Hello World - Searching for Magazines)");
			List<Magazine> magazineList = magazineRepository.findAll();
			model.addAttribute("magazines", magazineList);
			return "magazine.jsp";
		}

		System.out.println("Hello World - else part in book search executed)");
		return "librarymain.jsp";
	}

	@RequestMapping(value = "/Checkout", method = RequestMethod.POST)
	public String bookCheckOutOrHold(ModelMap model, @RequestParam String thisField, @RequestParam String anotherField,
			HttpSession session) throws Exception {

		System.out.println("Hello World - Checkout) " + thisField);
		// Check box is not empty then user can checkOut the items
		if (!(thisField.equals(""))) {
			String cbooks[] = thisField.split(",");
			String cErrors = "";
			for (int i = 0; i < cbooks.length; i++) {
				// Calendar class in Java is an abstract class that provides methods
				// for converting date between a specific instant in time and a set of
				// calendar fields such as MONTH, YEAR, HOUR, etc.
				Calendar c = Calendar.getInstance();
				// Number of Days to add
				c.add(Calendar.DAY_OF_MONTH, 30);
				// Date after adding the days to the given date
				// The java. util. Date class represents date and time in java.
				java.util.Date d = c.getTime();

				System.out.println("The check out due date is" + d);

				System.out.println("the book name is " + cbooks[i]);
				LibraryBook bk = libraryBookRepository.getOne(Long.parseLong(cbooks[i]));

				int copies = bk.getbCopies();
				if (copies >= 1) {
					// EveryTime User CheckOut the book it will reduce the count of copies
					bk.setbCopies(bk.getbCopies() - 1);
					libraryBookRepository.save(bk);
					CheckOut co = new CheckOut();
					co.setISBN(Long.parseLong(cbooks[i]));
					co.setType("Book");
					co.setDueDate(d);
					String usr = (String) session.getAttribute("userid");
					co.setUsername(usr);
					checkOutRepository.save(co);
				} else {
					cErrors = cErrors + "," + cbooks[i];
					model.put("cherror", cErrors);
				}

			}

		}

		System.out.println("Hello World - BookCheckout) " + anotherField);

		if (!(anotherField.equals(""))) {
			String hbooks[] = anotherField.split(",");
			for (int i = 0; i < hbooks.length; i++) {
				Calendar c = Calendar.getInstance();
				// Number of Days to add
				c.add(Calendar.DAY_OF_MONTH, 30);
				// Date after adding the days to the given date
				java.util.Date d = c.getTime();
				// Displaying the new Date after addition of Days
				System.out.println("Date after Addition: " + d);
				System.out.println(d);
				System.out.println("the book name is " + hbooks[i]);
				LibraryBook bk = libraryBookRepository.getOne(Long.parseLong(hbooks[i]));
				Hold ho = new Hold();
				ho.setiSBN(Long.parseLong(hbooks[i]));
				ho.setType("Book");
				ho.setAvailDate(d);
				String usr = (String) session.getAttribute("userid");
				ho.setUsername(usr);
				holdRepository.save(ho);
			}
		}
		return "librarymain.jsp";
	}

	@RequestMapping(value = "/dvdCheckout", method = RequestMethod.POST)
	public String dvdCheckOutOrHold(ModelMap model, @RequestParam String thisField, @RequestParam String anotherField,
			HttpSession session) throws Exception {

		System.out.println("Hello World - DVDCheckout) " + thisField);

		if (!(thisField.equals(""))) {
			String cDVD[] = thisField.split(",");
			for (int i = 0; i < cDVD.length; i++) {
				Calendar c = Calendar.getInstance();
				// Number of Days to add
				c.add(Calendar.DAY_OF_MONTH, 30);
				// Date after adding the days to the given date
				java.util.Date d = c.getTime();

				System.out.println("The check out due date is" + d);
				System.out.println("the DVD name is " + cDVD[i]);
				DVD dvd = dvdRepository.getOne(cDVD[i]);
				dvd.setdCopies(dvd.getdCopies() - 1);
				dvdRepository.save(dvd);
				CheckOut co = new CheckOut();
				co.setdTitle(cDVD[i]);
				co.setType("DVD");
				co.setDueDate(d);
				String usr = (String) session.getAttribute("userid");
				co.setUsername(usr);
				checkOutRepository.save(co);
			}
		}
		System.out.println("Hello World - DVDCheckout) " + anotherField);

		if (!(anotherField.equals(""))) {
			String hDVD[] = anotherField.split(",");
			for (int i = 0; i < hDVD.length; i++) {
				Calendar c = Calendar.getInstance();
				// Number of Days to add
				c.add(Calendar.DAY_OF_MONTH, 30);
				// Date after adding the days to the given date
				java.util.Date d = c.getTime();

				System.out.println("The check out due date is" + d);
				System.out.println("the DVD name is " + hDVD[i]);
				DVD dvd = dvdRepository.getOne(hDVD[i]);
				Hold ho = new Hold();
				ho.setdTitle(hDVD[i]);
				ho.setType("DVD");
				ho.setAvailDate(d);
				String usr = (String) session.getAttribute("userid");
				ho.setUsername(usr);
				holdRepository.save(ho);
			}
		}
		return "librarymain.jsp";
	}

	// This displays the Library Events.
	@RequestMapping(value = "/Events", method = RequestMethod.GET)

	public String Events() {
		System.out.println("Hello World - Events");
		return "Events.jsp";

	}

}
