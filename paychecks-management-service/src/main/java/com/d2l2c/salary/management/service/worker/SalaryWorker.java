/**
 * 
 */
package com.d2l2c.salary.management.service.worker;

import java.util.List;

import com.d2l2c.salary.management.service.bean.PaycheckSummary;

/**
 * @author dayanlazare
 *
 */
public interface SalaryWorker {

	public List<PaycheckSummary> getPaycheckSummary();
	
	public List<PaycheckSummary> getPaycheckSummary(int year);
	
	public List<PaycheckSummary> getPaycheckSummary(int year, int month);

}
