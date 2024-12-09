package com.example.ecommerce.model.order;

import com.example.ecommerce.model.payment.Payment;
import com.example.ecommerce.model.shipment.Shipment;
import com.example.ecommerce.model.user.Customer;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "order_id")
	private String orderID;

	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<OrderItem> items;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shipment_id")
	private Shipment shipment;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "payment_id")
	private Payment payment;

	@ManyToOne
	@JoinColumn(name = "discount_id")
	private Discount discount;

	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;

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

	public void setOrderID(String orderID) {
		this.orderID = orderID;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}