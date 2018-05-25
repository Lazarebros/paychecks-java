/**
 * 
 */
package com.d2l2c.paychecks.management.service.worker;

import java.util.List;

import com.d2l2c.paycheck.util.bean.PaycheckSummary;

/**
 * @author dayanlazare
 *
 */
public interface PaychecksServiceWorker {

	public List<PaycheckSummary> getPaychecks(String username, String password) throws Exception;
	
	public List<PaycheckSummary> getPaychecks(String username, String password, int year) throws Exception;
	
	public List<PaycheckSummary> getPaychecks(String username, String password, int year, int month) throws Exception;

}
