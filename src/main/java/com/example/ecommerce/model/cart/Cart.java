package com.example.ecommerce.model.cart;

import com.example.ecommerce.model.user.Customer;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private String cartID;
	private List<CartItem> items = new ArrayList<>();

	public Cart(String cartID, List<CartItem> items) {
		this.cartID = cartID;
		this.items = items;
	}

	public Cart(String cartID) {
		this.cartID = cartID;
		this.items = new ArrayList<>();
	}

	public String getCartID() {
		return this.cartID;
	}

	public void setCartID(String iD) {
		this.cartID = iD;
	}

	public List<CartItem> getItems() {
		return this.items;
	}

	public void setItems(List<CartItem> items) {
		this.items = items;
	}
}