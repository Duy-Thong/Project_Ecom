package com.example.ecommerce.model.user;

import com.example.ecommerce.model.order.Order;
import com.example.ecommerce.model.product.Rating;

import java.util.ArrayList;

public class Customer extends User {
	private Cart shoppingCart;
	private List<Order> orderHistory;
	private String paymentMethod;
	private String shippingAddress;
	public ArrayList<Rating> rating = new ArrayList<Rating>();
	public ArrayList<Order> orders = new ArrayList<Order>();
	public Cart cart;

	public List<Cart> getShoppingCart() {
		throw new UnsupportedOperationException();
	}

	public void setShoppingCart(List<Cart> shoppingCart) {
		throw new UnsupportedOperationException();
	}

	public List<Order> getOrderHistory() {
		throw new UnsupportedOperationException();
	}

	public void setOrderHistory(List<Order> orderHistory) {
		throw new UnsupportedOperationException();
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
}