package com.example.ecommerce.model.product.clothes;

import jakarta.persistence.*;

@Entity
@Table(name = "shirts")
@PrimaryKeyJoinColumn(name = "shirt_id")
public class Shirt extends Clothes {
	@Column(name = "sleeve_length", nullable = false)
	private double sleeveLength;

	@Column(name = "shirt_type", nullable = false)
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