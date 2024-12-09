package com.example.ecommerce.model.shipment;

import java.util.ArrayList;

public class ShipmentMethods {
	private String methodID;
	private String shipmentMethodName;
	public ArrayList<Shipment> shipment = new ArrayList<Shipment>();

	// Default constructor
	public ShipmentMethods() {
	}

	// Parameterized constructor
	public ShipmentMethods(String methodID, String shipmentMethodName) {
		this.methodID = methodID;
		this.shipmentMethodName = shipmentMethodName;
	}

	public String getMethodID() {
		return this.methodID;
	}

	public void setMethodID(String methodID) {
		this.methodID = methodID;
	}

	public String getShipmentMethodName() {
		return this.shipmentMethodName;
	}

	public void setShipmentMethodName(String shipmentMethodName) {
		this.shipmentMethodName = shipmentMethodName;
	}
}