package com.example.ecommerce.model.cart;

import com.example.ecommerce.model.product.Product;

public class CartItem {
	private String cartItemID;
	private int quantity;
	private Product product;
	public Cart cart;

	public String getCartItemID() {
		return this.cartItemID;
	}

	public void setCartItemID(String cartItemID) {
		this.cartItemID = cartItemID;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}