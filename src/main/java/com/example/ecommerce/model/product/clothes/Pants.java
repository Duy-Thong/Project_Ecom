package com.example.ecommerce.model.product.clothes;

public class Pants extends Clothes {
	private double waistSize;
	private double length;
	private String fitType;

	public double getWaistSize() {
		return this.waistSize;
	}

	public void setWaistSize(double waistSize) {
		this.waistSize = waistSize;
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getFitType() {
		return this.fitType;
	}

	public void setFitType(String fitType) {
		this.fitType = fitType;
	}
}