/**
 * 
 */
package com.d2l2c.paychecks.management.web.ui.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

import com.d2l2c.paychecks.management.web.ui.bean.PaycheckBean;

/**
 * @author dayanlazare
 *
 */
public class HomeViewOld implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<String> companies = new ArrayList<String>();

	private Set<Integer> years = new HashSet<Integer>();

	TreeMap<Integer, PaycheckBean> yearlyPaycheckMap = new TreeMap<Integer, PaycheckBean>();

	public List<String> getCompanies() {
		return companies;
	}

	public void setCompanies(List<String> companies) {
		this.companies = companies;
	}

	public Set<Integer> getYears() {
		return years;
	}

	public void setYears(Set<Integer> years) {
		this.years = years;
	}
	
	public TreeMap<Integer, PaycheckBean> getYearlyPaycheckMap() {
		return yearlyPaycheckMap;
	}

	public void setYearlyPaycheckMap(TreeMap<Integer, PaycheckBean> yearlyPaycheckMap) {
		this.yearlyPaycheckMap = yearlyPaycheckMap;
	}

	public Collection<PaycheckBean> getYearlyPaychecks() {
		return yearlyPaycheckMap.values();
	}

}
