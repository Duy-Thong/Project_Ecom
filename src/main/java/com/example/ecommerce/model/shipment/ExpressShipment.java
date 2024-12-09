package com.example.ecommerce.model.shipment;

import jakarta.persistence.*;

@Entity
@Table(name = "express_shipments")
@PrimaryKeyJoinColumn(name = "express_shipment_id")
public class ExpressShipment extends Shipment {
	@Column(name = "delivery_time", nullable = false)
	private int deliveryTime;

	@Column(name = "expedited_fee", nullable = false)
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