package com.d2l2c.paychecks.management.web.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.ModelMap;

/**
 * @author dayanlazare
 *
 */
public class BaseController {

	private static final String LOGGED_IN_USER_ATTR_NAME = "loggedinuser";

	protected void addLoggedInUser(ModelMap model) {
		model.addAttribute(LOGGED_IN_USER_ATTR_NAME, getLoggedInUserName());
	}
	
	protected String getLoggedInUserName() {
		return getUserName();
	}

	/**
	 * This method returns the principal[user-name] of logged-in user.
	 */
	protected String getUserName() {
		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
			userName = ((UserDetails) principal).getUsername();
		} else {
			userName = principal.toString();
		}
		return userName;
	}

	/**
	 * This method returns the decrypted password of logged-in user.
	 */
	protected String getUserPassword() {
		String password = null;
		Object credentials = SecurityContextHolder.getContext().getAuthentication().getCredentials();
		if (credentials instanceof UserDetails) {
			password = ((UserDetails) credentials).getPassword();
		} else {
			password = credentials.toString();
		}
		return password;
	}

}
