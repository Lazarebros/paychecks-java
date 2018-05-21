/**
 * 
 */
package com.d2l2c.paychecks.management.service.worker.impl;

import java.util.List;

import com.d2l2c.paychecks.management.service.bean.PaycheckSummary;
import com.d2l2c.paychecks.management.service.worker.PaychecksServiceWorker;

/**
 * @author dayanlazare
 *
 */
public class PaychecksServiceWorkerImpl implements PaychecksServiceWorker {

	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public List<PaycheckSummary> getPaycheckSummary() {
		return null;
	}

	@Override
	public List<PaycheckSummary> getPaycheckSummary(int year) {
		return null;
	}

	@Override
	public List<PaycheckSummary> getPaycheckSummary(int year, int month) {
		return null;
	}

}
