package com.example.ecommerce.model.order;

import com.example.ecommerce.model.payment.Payment;
import com.example.ecommerce.model.shipment.Shipment;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private String orderID;
	private List<OrderItem> items;
	private Shipment shipment;
	private Payment payment;
	private Discount discount;

	public Order() {
		this.items = new ArrayList<>();
	}
	
	public Order(String orderID) {
		this();
		this.orderID = orderID;
	}
	
	public Order(String orderID, List<OrderItem> items) {
		this(orderID);
		setItems(items);
	}
	
	public Order(String orderID, List<OrderItem> items, Shipment shipment, Payment payment) {
		this(orderID, items);
		this.shipment = shipment;
		this.payment = payment;
	}

	public String getOrderID() {
		return this.orderID;
	}

	public void setOrderID(String iD) {
		this.orderID = iD;
	}

	public List<OrderItem> getItems() {
		return this.items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items != null ? items : new ArrayList<>();
	}

	public Shipment getShipment() {
		return this.shipment;
	}

	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}

	public Payment getPayment() {
		return this.payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Discount getDiscount() {
		return this.discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
}