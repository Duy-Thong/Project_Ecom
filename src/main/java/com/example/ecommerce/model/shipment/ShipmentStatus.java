package com.example.ecommerce.model.shipment;

public class ShipmentStatus {
	private String statusID;
	private Date timestamp;
	private String location;
	private String statusDescription;
	public Shipment shipment;

	public String getStatusID() {
		return this.statusID;
	}

	public void setStatusID(String statusID) {
		this.statusID = statusID;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatusDescription() {
		return this.statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
}