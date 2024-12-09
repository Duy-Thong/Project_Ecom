package com.example.ecommerce.model.payment;

import java.util.ArrayList;

public class PaymentStatus {
	private String statusID;
	private String paymentStatusName;

	public String gettStatusID() {
		throw new UnsupportedOperationException();
	}

	public void setStatusID(String statusID) {
		this.statusID = statusID;
	}

	public String getPaymentStatusName() {
		return this.paymentStatusName;
	}

	public void setPaymentStatusName(String paymentStatusName) {
		this.paymentStatusName = paymentStatusName;
	}
}