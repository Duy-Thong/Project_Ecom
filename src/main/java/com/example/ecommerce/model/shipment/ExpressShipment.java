package com.example.ecommerce.model.shipment;

public class ExpressShipment extends Shipment {
	private int deliveryTime;
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