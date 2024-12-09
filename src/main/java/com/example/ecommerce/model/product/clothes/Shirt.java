package com.example.ecommerce.model.product.clothes;

public class Shirt extends Clothes {
	private double sleeveLength;
	private String shirtType;

	public double getSleeveLength() {
		return this.sleeveLength;
	}

	public void setSleeveLength(double sleeveLength) {
		this.sleeveLength = sleeveLength;
	}

	public String getShirtType() {
		return this.shirtType;
	}

	public void setShirtType(String shirtType) {
		this.shirtType = shirtType;
	}
}