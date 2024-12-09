package com.example.ecommerce.model.user;

import com.example.ecommerce.model.order.Order;
import com.example.ecommerce.model.product.Rating;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
	private Cart shoppingCart;
	private List<Order> orderHistory;
	private String paymentMethod;
	private String shippingAddress;

	// Constructor
	public Customer() {
		this.orderHistory = new ArrayList<>();
	}

	public List<Order> getOrderHistory() {
		return this.orderHistory;
	}

	public void setOrderHistory(List<Order> orderHistory) {
		this.orderHistory = orderHistory;
	}

	public String getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getShippingAddress() {
		return this.shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Cart getShoppingCart() {
		return this.shoppingCart;
	}

	public void setShoppingCart(Cart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
}