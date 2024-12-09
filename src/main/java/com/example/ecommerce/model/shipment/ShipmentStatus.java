package com.example.ecommerce.model.shipment;

public class ShipmentStatus {
	private String statusID;
	private Date timestamp;
	private String location;
	private String statusDescription;

	public ShipmentStatus() {
		// Default constructor
	}

	public ShipmentStatus(String statusID, Date timestamp, String location, String statusDescription) {
		this.statusID = statusID;
		this.timestamp = timestamp;
		this.location = location;
		this.statusDescription = statusDescription;
	}

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