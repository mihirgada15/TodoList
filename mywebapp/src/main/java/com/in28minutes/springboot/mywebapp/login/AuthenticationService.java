package com.in28minutes.springboot.mywebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String username, String password) {
		boolean isValidUsername = username.equalsIgnoreCase("Mihir Gada");
		boolean isValidPassword = password.equalsIgnoreCase("password");
		return isValidUsername && isValidPassword;
	}

	
}
