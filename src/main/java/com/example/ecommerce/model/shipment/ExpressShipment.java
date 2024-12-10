package com.example.ecommerce.model.shipment;

import jakarta.persistence.*;

public class ExpressShipment extends Shipment {
	@Column(name = "delivery_time")
	private int deliveryTime;

	@Column(name = "expedited_fee")
	private double expeditedFee;

	public int getDeliveryTime() {
		return this.deliveryTime;
	}

	public void setDeliveryTime(int deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public double getExpeditedFee() {
		return this.expeditedFee;
	}

	public void setExpeditedFee(double expeditedFee) {
		this.expeditedFee = expeditedFee;
	}
}