package com.example.ecommerce.model.product.clothes;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("DRESS")
public class Dress extends Clothes {
	@Column(name = "dress_length")
	private double dressLength;

	@Column(name = "dress_type")
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