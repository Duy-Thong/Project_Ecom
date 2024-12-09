package com.example.ecommerce.model.payment;

public class PaypalPayment extends Payment {
	private String paypalAccount;
	private String paypalEmail;

	public String getPaypalAccount() {
		return this.paypalAccount;
	}

	public void setPaypalAccount(String paypalAccount) {
		this.paypalAccount = paypalAccount;
	}

	public String getPaypalEmail() {
		return this.paypalEmail;
	}

	public void setPaypalEmail(String paypalEmail) {
		this.paypalEmail = paypalEmail;
	}
}