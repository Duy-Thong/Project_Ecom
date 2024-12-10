package com.example.ecommerce.model.payment;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("CASH_ON_DELIVERY")
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