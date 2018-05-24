package com.d2l2c.paychecks.management.web.controller;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.d2l2c.paychecks.management.service.bean.PaycheckSummary;
import com.d2l2c.paychecks.management.service.worker.PaychecksServiceWorker;
import com.d2l2c.paychecks.management.web.ui.bean.PaycheckBean;
import com.d2l2c.paychecks.management.web.ui.view.HomeView;
import com.d2l2c.paychecks.management.web.util.PaychecksWebUtil;

/**
 * @author dayanlazare
 *
 */
@Controller
public class HomeController extends BaseController {

	private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

	private static final String HOME_VIEW_ATTR_NAME = "homeView";

	private HomeView homeView = new HomeView();

	@Autowired
	PaychecksServiceWorker paychecksServiceWorker;

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		super.addLoggedInUser(model);
		this.getYearList();

		model.addAttribute(HOME_VIEW_ATTR_NAME, homeView);
		return "home";
	}

	private void getYearList() {
		try {
			List<Integer> years = Arrays.asList(2017, 2016);
			homeView.setYears(years);

			this.getYearlyPaychecks(years);
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
	}

	private void getYearlyPaychecks(List<Integer> years) throws Exception {
		List<PaycheckSummary> paycheckSummaryList = paychecksServiceWorker.getPaychecks(getUserName(), getUserPassword());
		TreeMap<Integer, PaycheckBean> yearlyPaycheckMap = PaychecksWebUtil.groupPaychecksByYear(paycheckSummaryList);
		homeView.setYearlyPaycheckMap(yearlyPaycheckMap);
	}

}
