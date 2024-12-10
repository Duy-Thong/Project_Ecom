package com.example.ecommerce.model.shipment;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "shipments")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "shipment_type")
public class Shipment {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "shipment_id")
	private String shipmentID;

	@Column(name = "shipment_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date shipmentDate;

	@Column(name = "estimated_delivery_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date estimatedDeliveryDate;

	@Column(name = "actual_delivery_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date actualDeliveryDate;

	@Column(name = "shipping_address", columnDefinition = "TEXT")
	private String shippingAddress;

	@Column(name = "tracking_number", unique = true)
	private String trackingNumber;

	@Column
	private double fee;

	@Column
	private String type;

	@Column
	private String status;

	@OneToMany(mappedBy = "shipment", cascade = CascadeType.ALL)
	private List<ShipmentStatus> shipmentStatuses = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "method_id", nullable = false)
	private ShipmentMethods shipmentMethod;

	public Shipment() {
	}

	public Shipment(String shipmentID, Date shipmentDate, Date estimatedDeliveryDate, 
					Date actualDeliveryDate, String shippingAddress, String trackingNumber, 
					double fee, String type, String status, List<ShipmentStatus> shipmentStatuses, 
					ShipmentMethods shipmentMethod) {
		this.shipmentID = shipmentID;
		this.shipmentDate = shipmentDate;
		this.estimatedDeliveryDate = estimatedDeliveryDate;
		this.actualDeliveryDate = actualDeliveryDate;
		this.shippingAddress = shippingAddress;
		this.trackingNumber = trackingNumber;
		this.fee = fee;
		this.type = type;
		this.status = status;
		this.shipmentStatuses = shipmentStatuses;
		this.shipmentMethod = shipmentMethod;
	}

	public String getShipmentID() {
		return this.shipmentID;
	}

	public void setShipmentID(String shipmentID) {
		this.shipmentID = shipmentID;
	}

	public Date getShipmentDate() {
		return this.shipmentDate;
	}

	public void setShipmentDate(Date shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public Date getEstimatedDeliveryDate() {
		return this.estimatedDeliveryDate;
	}

	public void setEstimatedDeliveryDate(Date estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}

	public Date getActualDeliveryDate() {
		return this.actualDeliveryDate;
	}

	public void setActualDeliveryDate(Date actualDeliveryDate) {
		this.actualDeliveryDate = actualDeliveryDate;
	}

	public String getShippingAddress() {
		return this.shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getTrackingNumber() {
		return this.trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<ShipmentStatus> getShipmentStatuses() {
		return this.shipmentStatuses;
	}

	public void setShipmentStatuses(List<ShipmentStatus> shipmentStatuses) {
		this.shipmentStatuses = shipmentStatuses;
	}

	public ShipmentMethods getShipmentMethod() {
		return this.shipmentMethod;
	}

	public void setShipmentMethod(ShipmentMethods shipmentMethod) {
		this.shipmentMethod = shipmentMethod;
	}

	public double getFee() {
		return this.fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
}