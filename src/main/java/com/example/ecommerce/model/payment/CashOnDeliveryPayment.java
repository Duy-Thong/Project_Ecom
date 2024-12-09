package com.example.ecommerce.model.payment;

import jakarta.persistence.*;

@Entity
@Table(name = "cash_on_delivery_payments")
@PrimaryKeyJoinColumn(name = "cash_on_delivery_payment_id")
public class CashOnDeliveryPayment extends Payment {
	@Column(name = "cash_amount", nullable = false)
	private double cashAmount;

	public double getCashAmount() {
		return this.cashAmount;
	}

	public void setCashAmount(double cashAmount) {
		this.cashAmount = cashAmount;
	}
}