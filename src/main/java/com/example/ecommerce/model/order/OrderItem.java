package com.example.ecommerce.model.order;

import com.example.ecommerce.model.product.Product;

public class OrderItem {
	private String orderItemID;
	private int quantity;
	private Product product;
	public Order order;

	public String getOrderItemID() {
		return this.orderItemID;
	}

	public void setOrderItemID(String iD) {
		this.orderItemID = iD;
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