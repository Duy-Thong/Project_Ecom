package com.example.ecommerce.model.shipment;

import java.util.ArrayList;

public class ShipmentMethods {
	private String methodID;
	private String shipmentMethodName;
	public ArrayList<Shipment> shipment = new ArrayList<Shipment>();

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