package com.in28minutes.springboot.mywebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

	private AuthenticationService authenticationservice;

	public LoginController(AuthenticationService authenticationservice) {
		super();
		this.authenticationservice = authenticationservice;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String gotoLoginPage() {

		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

		if (authenticationservice.authenticate(name, password)) {
			model.put("name", name);
		//	model.put("password", password); Since we dont want to show the password i'll comment it out
			return "Welcome";
		}
		model.put("errorMessage", "Invalid Credentials!! Please Try Again");
		return "login";
	}

	// private Logger logger = LoggerFactory.getLogger(getClass()); //Never use
	// sysout for logging use logger instead
//login page => Create package login => LoginController => login.jsp

//	@RequestMapping("login")
//	public String gotoLoginPage(@RequestParam String name, ModelMap model) {
//		model.put("name", name);
//		return "login";

//		System.out.println("The name is :" + name);	//Not Recommended for prod code
//		logger.debug("The logger name is " +name);
//		logger.info("I want this printed at info level");
//		logger.warn("Warning I want this printed at warn level");

}
