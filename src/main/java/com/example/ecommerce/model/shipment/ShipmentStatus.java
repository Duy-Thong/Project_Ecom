package com.example.ecommerce.model.shipment;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "shipment_statuses")
public class ShipmentStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "status_id")
	private String statusID;

	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	@Column
	private String location;

	@Column(name = "status_description", columnDefinition = "TEXT")
	private String statusDescription;

	@ManyToOne
	@JoinColumn(name = "shipment_id")
	private Shipment shipment;

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

	public Shipment getShipment() {
		return shipment;
	}

	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}
}