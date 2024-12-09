package com.example.ecommerce.model.shipment;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shipment_methods")
public class ShipmentMethods {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "method_id")
	private String methodID;

	@Column(name = "method_name", nullable = false, unique = true)
	private String shipmentMethodName;

	@OneToMany(mappedBy = "shipmentMethod")
	private List<Shipment> shipments = new ArrayList<>();

	public ShipmentMethods() {
	}

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

	public List<Shipment> getShipments() {
		return shipments;
	}

	public void setShipments(List<Shipment> shipments) {
		this.shipments = shipments;
	}
}