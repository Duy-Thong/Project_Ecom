package com.example.ecommerce.model.order;

import com.example.ecommerce.model.payment.Payment;
import com.example.ecommerce.model.shipment.Shipment;

import java.util.ArrayList;

public class Order {
	private String orderID;
	private List<OrderItem> items;
	private Shipment shipment;
	private Payment payment;
	private Discount discount;
	public Customer customer;
	public ArrayList<OrderItem> orderItems = new ArrayList<OrderItem>();

	public String getOrderID() {
		return this.orderID;
	}

	public void setOrderID(String iD) {
		this.orderID = iD;
	}

	public List<OrderItem> getItems() {
		throw new UnsupportedOperationException();
	}

	public void setItems(List<OrderItem> items) {
		throw new UnsupportedOperationException();
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