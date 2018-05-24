package com.d2l2c.paychecks.management.service.bean;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author dlazare
 *
 */
public class PaycheckDetails {

	private Long id;
	private String companyCode;
	private Date startDate;
	private Date endDate;
	private int month;
	private Long numberOfHours;
	private BigDecimal hourlyRate;
	private BigDecimal expectedGrossAmount;
	private BigDecimal grossAmount;
	private BigDecimal expectedNetPay;
	private BigDecimal netPay;
	private BigDecimal reimbursement;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public Long getNumberOfHours() {
		return numberOfHours;
	}

	public void setNumberOfHours(Long numberOfHours) {
		this.numberOfHours = numberOfHours;
	}

	public BigDecimal getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(BigDecimal hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public BigDecimal getExpectedGrossAmount() {
		return expectedGrossAmount;
	}

	public void setExpectedGrossAmount(BigDecimal expectedGrossAmount) {
		this.expectedGrossAmount = expectedGrossAmount;
	}

	public BigDecimal getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(BigDecimal grossAmount) {
		this.grossAmount = grossAmount;
	}

	public BigDecimal getExpectedNetPay() {
		return expectedNetPay;
	}

	public void setExpectedNetPay(BigDecimal expectedNetPay) {
		this.expectedNetPay = expectedNetPay;
	}

	public BigDecimal getNetPay() {
		return netPay;
	}

	public void setNetPay(BigDecimal netPay) {
		this.netPay = netPay;
	}

	public BigDecimal getReimbursement() {
		return reimbursement;
	}

	public void setReimbursement(BigDecimal reimbursement) {
		this.reimbursement = reimbursement;
	}

	@Override
	public String toString() {
		return "PaycheckDetails [id=" + id + ", companyCode=" + companyCode + ", startDate=" + startDate + ", endDate="
				+ endDate + ", month=" + month + ", numberOfHours=" + numberOfHours + ", hourlyRate=" + hourlyRate
				+ ", expectedGrossAmount=" + expectedGrossAmount + ", grossAmount=" + grossAmount + ", expectedNetPay="
				+ expectedNetPay + ", netPay=" + netPay + ", reimbursement=" + reimbursement + "]";
	}

}
