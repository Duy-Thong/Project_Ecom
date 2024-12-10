package com.example.ecommerce.model.product.clothes;

import jakarta.persistence.*;

@Entity
@Table(name = "pants")
@PrimaryKeyJoinColumn(name = "pants_id")
@DiscriminatorValue("PANTS")
public class Pants extends Clothes {
	@Column(name = "waist_size", nullable = false)
	private double waistSize;

	@Column(nullable = false)
	private double length;

	@Column(name = "fit_type", nullable = false)
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