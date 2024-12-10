package com.example.ecommerce.model.payment;

import jakarta.persistence.*;

public class PaypalPayment extends Payment {
	@Column(name = "paypal_account")
	private String paypalAccount;

	@Column(name = "paypal_email")
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