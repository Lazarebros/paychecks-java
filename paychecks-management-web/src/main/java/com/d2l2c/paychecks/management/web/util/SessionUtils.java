/**
 * 
 */
package com.d2l2c.paychecks.management.web.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author dayanlazare
 *
 */
public class SessionUtils {

	public static HttpSession getSession() {
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        return attributes.getRequest().getSession();
	}

	public static HttpServletRequest getRequest() {
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        return attributes.getRequest();
	}

	public static void setUserName(String username) {
		HttpSession session = getSession();
		if (session != null) {
			session.setAttribute("username", username);
		}
	}

	public static String getUserName() {
		HttpSession session = getSession();
		if (session != null) {
			return (String) session.getAttribute("username");
		} else {
			return null;
		}
	}

	public static String getUserId() {
		HttpSession session = getSession();
		if (session != null) {
			return (String) session.getAttribute("userid");
		} else {
			return null;
		}
	}

}
