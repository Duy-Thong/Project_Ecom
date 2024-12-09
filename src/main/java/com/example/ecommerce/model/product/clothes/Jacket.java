package com.example.ecommerce.model.product.clothes;

public class Jacket extends Clothes {
	private String jacketType;
	private boolean hasHood;

	public String getJacketType() {
		return this.jacketType;
	}

	public void setJacketType(String jacketType) {
		this.jacketType = jacketType;
	}

	public boolean getHasHood() {
		return this.hasHood;
	}

	public void setHasHood(boolean hasHood) {
		this.hasHood = hasHood;
	}
}