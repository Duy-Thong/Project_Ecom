package com.example.ecommerce.model.payment;

public class CashOnDeliveryPayment extends Payment {
	private double cashAmount;

	public double getCashAmount() {
		return this.cashAmount;
	}

	public void setCashAmount(double cashAmount) {
		this.cashAmount = cashAmount;
	}
}