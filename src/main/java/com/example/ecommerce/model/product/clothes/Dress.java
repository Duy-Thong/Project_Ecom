package com.example.ecommerce.model.product.clothes;

public class Dress extends Clothes {
	private double dressLength;
	private double dressType;

	public double getDressLength() {
		return this.dressLength;
	}

	public void setDressLength(double dressLength) {
		this.dressLength = dressLength;
	}

	public double getDressType() {
		return this.dressType;
	}

	public void setDressType(double dressType) {
		this.dressType = dressType;
	}
}