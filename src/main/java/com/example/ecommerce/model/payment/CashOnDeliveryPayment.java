package com.example.ecommerce.model.payment;

import jakarta.persistence.*;

public class CashOnDeliveryPayment extends Payment {
	@Column(name = "cash_amount")
	private double cashAmount;

	public double getCashAmount() {
		return this.cashAmount;
	}

	public void setCashAmount(double cashAmount) {
		this.cashAmount = cashAmount;
	}
}