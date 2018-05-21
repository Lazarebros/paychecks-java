/**
 * 
 */
package com.d2l2c.paychecks.management.service.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.d2l2c.common.util.http.HttpUtil;
import com.d2l2c.paychecks.management.service.bean.PaycheckSummary;
import com.google.gson.Gson;

/**
 * @author dlazare
 *
 */
public class MapperUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(MapperUtil.class);

	public static void main(String[] args) {
		String url = "http://127.0.0.1:8081/api/paychecks/2017";
		String username = "test";
		String password = "test1234";

		String json = HttpUtil.send(url, username, password);

		LOGGER.info(json);

		PaycheckSummary pay = new Gson().fromJson(json, PaycheckSummary.class);

		System.out.println(pay);

	}

}
