package com.example.ecommerce.model.shipment;

public class InternationalShipment extends Shipment {
	private String destinationCountry;
	private double customsFee;
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