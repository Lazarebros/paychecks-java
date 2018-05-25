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

import com.d2l2c.paychecks.management.web.ui.bean.EChartBean;
import com.d2l2c.paychecks.management.web.ui.bean.YearSummary;

/**
 * @author dayanlazare
 *
 */
public class HomeView implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<String> companies = new ArrayList<String>();
	private Set<Integer> years = new HashSet<Integer>();
	private Collection<YearSummary> yearSummaryList = new ArrayList<YearSummary>();
	
	private EChartBean chartBean = new EChartBean();

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

	public Collection<YearSummary> getYearSummaryList() {
		return yearSummaryList;
	}

	public void setYearSummaryList(Collection<YearSummary> yearSummaryList) {
		this.yearSummaryList = yearSummaryList;
	}

	public EChartBean getChartBean() {
		return chartBean;
	}

	public void setChartBean(EChartBean chartBean) {
		this.chartBean = chartBean;
	}
	
	

}
