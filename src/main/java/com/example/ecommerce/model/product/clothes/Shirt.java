package com.example.ecommerce.model.product.clothes;

public class Shirt extends Clothes {
	private double sleeveLength;
	private Object shirtType;

	public double getSleeveLength() {
		return this.sleeveLength;
	}

	public void setSleeveLength(double sleeveLength) {
		this.sleeveLength = sleeveLength;
	}

	public void getShirtType() {
		return this.shirtType;
	}

	public void setShirtType(Object shirtType) {
		this.shirtType = shirtType;
	}
}