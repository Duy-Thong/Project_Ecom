package com.example.ecommerce.model.cart;

import com.example.ecommerce.model.user.Customer;

import java.util.ArrayList;

public class Cart {
	private String cartID;
	private List<CartItem> items;
	public Customer customer;
	public ArrayList<CartItem> cartItems = new ArrayList<CartItem>();

	public String getCartID() {
		return this.cartID;
	}

	public void setCartID(String iD) {
		this.cartID = iD;
	}

	public List<CartItem> getItems() {
		throw new UnsupportedOperationException();
	}

	public void setItems(List<CartItem> items) {
		throw new UnsupportedOperationException();
	}
}