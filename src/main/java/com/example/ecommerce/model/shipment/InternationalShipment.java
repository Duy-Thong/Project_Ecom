package com.example.ecommerce.model.shipment;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("INTERNATIONAL")
public class InternationalShipment extends Shipment {
	@Column(name = "destination_country")
	private String destinationCountry;

	@Column(name = "customs_fee")
	private double customsFee;

	@Column(name = "international_tracking_number", unique = true)
	private String internationalTrackingNumber;

	public String getDestinationCountry() {
		return this.destinationCountry;
	}

	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}

	public double getCustomsFee() {
		return this.customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}

	public String getInternationalTrackingNumber() {
		return this.internationalTrackingNumber;
	}

	public void setInternationalTrackingNumber(String internationalTrackingNumber) {
		this.internationalTrackingNumber = internationalTrackingNumber;
	}
}