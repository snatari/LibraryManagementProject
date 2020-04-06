package com.library.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.library.model.LibraryUser;
import com.library.repositories.LibraryUserRepository;

//controller class to handle requests coming from the client. 
@Controller
//@SessionAttributes annotation is used to store the model attribute in the session.
@SessionAttributes({ "username", "userid", "usertype" })
public class HController {
	//@Autowired will Connect From one object to another object in Spring Container.
	@Autowired
	private LibraryUserRepository libraryUserRepository;

	//@RequestMapping to map URLs to controller methods in different ways.	
	@RequestMapping("home")
	public String getHome() {
		System.out.println("Hello World - home");
		return "home.jsp";
	}

	@RequestMapping(value = "/LoginRegister", params = "login", method = RequestMethod.POST)
	public String Login(ModelMap model, @RequestParam String username, @RequestParam String password) {

		System.out.println("Hello World - LoginRegister");
		//Validating the UserName and Password
		if (username.isEmpty() && (password.isEmpty())) {
		//Throws an Error message to the User.
			model.put("errorMessage", "Please Enter Credentials");
			System.out.println("Hello World - Please Enter Credentials");
			return "home";
		}

		if (username.isEmpty() || (password.isEmpty())) {
			model.put("errorMessage", "Please Enter Credentials - username or password is missing");
			System.out.println("Hello World - Please Enter Credentials - username or password is missing");
			return "home";
		}

		List<LibraryUser> userList = libraryUserRepository.findAll();
		//Looping to the all the usersTable
		for (LibraryUser l : userList) {

			System.out.println("inside the loop - " + l.getPassword());

			if (l.getuName().equals(username) && (l.getPassword().equals(password))) {
				System.out.println("user provided vaild credentials");
				model.put("username", l.getfName());
				model.put("password", password);
				model.put("userid", l.getuName());
				model.put("usertype", l.getUsrType());
				model.put("cErrors", "");
				return "librarymain.jsp";
			}

			if (!(l.getuName().equals(username)) || !((l.getPassword().equals(password))))
				continue;

		}

		model.put("errorMessage", "Please Enter the valid Credentials - username or password not matching");
		System.out.println("Hello World - Please Enter Credentials - username or password not matching");
		return "home";
	}

	@RequestMapping(value = "/LoginRegister", params = "register", method = RequestMethod.POST)

	public String Register() {
		System.out.println("Hello World - register");
		return "registration.jsp";

	}

	@RequestMapping(value = "/Registration", method = RequestMethod.POST)
	//@RequestParam to extract query parameters, form parameters and even files from the request.
	public String Registration(ModelMap model, @RequestParam String firstname, @RequestParam String lastname,
			@RequestParam String email, @RequestParam String addressL1, @RequestParam String addressL2,
			@RequestParam String State, @RequestParam String City, @RequestParam int ZipCode,
			@RequestParam String username, @RequestParam String password, @RequestParam String dob,
			@RequestParam long phone) {

		System.out.println("Hello World - registration (generating new user)");
		System.out.println("first name " + firstname);
		System.out.println("password " + password);
		System.out.println("date of birth " + dob);

		List<LibraryUser> userList = libraryUserRepository.findAll();
		//Validating if the user already exists .User can't Register again.
		boolean usrexsits = false;
		for (LibraryUser l : userList) {

			if (l.getuName().equals(username)) {

				usrexsits = true;
				System.out.println("user already exists");
				//Throws error message to the user.
				model.put("errorMessage", "user already exists.. please enter a new user name and try again");
				return "registration.jsp";

			}

		}

		if (!usrexsits) {
			libraryUserRepository.save(new LibraryUser(username, null, password, firstname, lastname, addressL1,
					addressL2, null, City, ZipCode, null, email, phone, "user"));
			model.put("username", firstname);
			model.put("username", firstname);
			model.put("password", password);
			model.put("userid", username);
			model.put("usertype", "user");
			model.put("cErrors", "");

		}
		return "librarymain.jsp";
	}

}
