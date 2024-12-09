package com.example.ecommerce.model.payment;

import jakarta.persistence.*;

@Entity
@Table(name = "paypal_payments")
@PrimaryKeyJoinColumn(name = "paypal_payment_id")
public class PaypalPayment extends Payment {
	@Column(name = "paypal_account", nullable = false)
	private String paypalAccount;

	@Column(name = "paypal_email", nullable = false)
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