/**
 * 
 */
package com.d2l2c.paychecks.management.web.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

import org.dozer.DozerBeanMapper;

import com.d2l2c.paycheck.util.bean.PaycheckDetail;
import com.d2l2c.paycheck.util.bean.PaycheckSummary;
import com.d2l2c.paychecks.management.web.ui.bean.EChartBean;
import com.d2l2c.paychecks.management.web.ui.bean.YearSummary;
import com.d2l2c.paychecks.management.web.ui.view.HomeView;
import com.d2l2c.user.management.bean.User;

/**
 * @author dayanlazare
 *
 */
public class PaychecksWebUtil {

	private static DozerBeanMapper mapper;

	static {
		mapper = new DozerBeanMapper();
	}

	public static void sortUsers(List<User> users, boolean reverse) {
		Comparator<User> comparator = new Comparator<User>() {
			@Override
			public int compare(User p1, User p2) {
				return compareLong(p1.getId(), p2.getId());
			}
		};
		if (reverse) {
			Collections.sort(users, comparator.reversed());
		} else {
			Collections.sort(users, comparator);
		}
	}

	public static int compareInt(int value1, int value2) {
		int result = 0;
		if (value1 > value2) {
			result = 1;
		} else if (value1 < value2) {
			result = -1;
		} else {
			result = 0;
		}
		return result;
	}

	public static int compareLong(Long value1, Long value2) {
		int result = 0;
		if (value1 > value2) {
			result = 1;
		} else if (value1 < value2) {
			result = -1;
		} else {
			result = 0;
		}
		return result;
	}

	public static HomeView getHomeView(List<PaycheckSummary> PaycheckSummaryList) {
		HomeView homeView = new HomeView();
		TreeMap<Integer, YearSummary> yearSummaryMap = new TreeMap<Integer, YearSummary>(Collections.reverseOrder());
		PaycheckSummaryList.forEach(paycheckSummary -> {
			YearSummary yearSummary = mapper.map(paycheckSummary, YearSummary.class);
			yearSummaryMap.put(paycheckSummary.getYear(), yearSummary);
		});
		homeView.setYearSummaryList(yearSummaryMap.values());
		homeView.setYears(yearSummaryMap.keySet());
		
		EChartBean eChartBean = new EChartBean();
		eChartBean.setYearSummaryMap(yearSummaryMap);
		
		homeView.setChartBean(eChartBean);
		
		return homeView;
	}

	public static TreeMap<Integer, PaycheckDetail> groupPaycheckDetailsByMonth(List<PaycheckDetail> paycheckDetails) {
		TreeMap<Integer, PaycheckDetail> paycheckDetailMap = new TreeMap<Integer, PaycheckDetail>();
		paycheckDetails.forEach(paycheckDetail -> {
			PaycheckDetail paycheckDetailCopy = mapper.map(paycheckDetail, PaycheckDetail.class);
			paycheckDetailMap.put(paycheckDetailCopy.getMonth(), paycheckDetailCopy);
		});
		return paycheckDetailMap;
	}

}
