package com.example.ecommerce.model.order;

import java.util.ArrayList;

public class Discount {
	private String discountID;
	private String code;
	private int percent;
	private Date startDate;
	private Date endDate;
	public ArrayList<Order> order = new ArrayList<Order>();

	public String getID() {
		throw new UnsupportedOperationException();
	}

	public void setID(String iD) {
		throw new UnsupportedOperationException();
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getPercent() {
		return this.percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDiscountID() {
		return this.discountID;
	}

	public void setDiscountID(String discountID) {
		this.discountID = discountID;
	}
}