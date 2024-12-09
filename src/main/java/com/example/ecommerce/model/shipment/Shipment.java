package com.example.ecommerce.model.shipment;

public class Shipment {
	private String shipmentID;
	private Date shipmentDate;
	private Date estimatedDeliveryDate;
	private Date actualDeliveryDate;
	private String shippingAddress;
	private String trackingNumber;
	private double fee;
	private String type;
	private String status;
	private List<ShipmentStatus> shipmentStatuses;
	private ShipmentMethods shipmentMethod;
	public Order order;
	public ShipmentMethods shipmentMethods;

	public String getShipmentID() {
		return this.shipmentID;
	}

	public void setShipmentID(String iD) {
		this.shipmentID = iD;
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
		throw new UnsupportedOperationException();
	}

	public void setShipmentStatuses(List<ShipmentStatus> shipmentStatuses) {
		throw new UnsupportedOperationException();
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