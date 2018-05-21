/**
 * 
 */
package com.d2l2c.paychecks.management.service.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author dlazare
 *
 */
public class HttpUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(HttpUtil.class);

	public static void main(String[] args) {
		String url = "http://127.0.0.1:8081/api/paychecks/2017";
		String username = "test";
		String password = "test1234";

		String test = com.d2l2c.common.util.http.HttpUtil.send(url, username, password);

		LOGGER.info("Response : " + test);
	}

}
