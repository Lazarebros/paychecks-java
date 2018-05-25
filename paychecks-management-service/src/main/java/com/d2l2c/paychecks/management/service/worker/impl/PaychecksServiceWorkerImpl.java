/**
 * 
 */
package com.d2l2c.paychecks.management.service.worker.impl;

import java.util.List;

import com.d2l2c.common.util.http.HttpUtil;
import com.d2l2c.paycheck.util.bean.PaycheckSummary;
import com.d2l2c.paychecks.management.service.bean.PaycheckSummaryList;
import com.d2l2c.paychecks.management.service.worker.PaychecksServiceWorker;
import com.google.gson.Gson;

/**
 * @author dayanlazare
 *
 */
public class PaychecksServiceWorkerImpl implements PaychecksServiceWorker {
	
	Gson gson = new Gson();

	private static final String SUMMARY_API_URL_PREFIX = "summary";

	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public List<PaycheckSummary> getPaychecks(String username, String password) throws Exception {
		String fullRrl = url + SUMMARY_API_URL_PREFIX;
		String json = HttpUtil.send(fullRrl, username, password);
		return gson.fromJson(json, PaycheckSummaryList.class);
	}

	@Override
	public List<PaycheckSummary> getPaychecks(String username, String password,int year) throws Exception {
		return null;
	}

	@Override
	public List<PaycheckSummary> getPaychecks(String username, String password,int year, int month) throws Exception {
		return null;
	}

}
