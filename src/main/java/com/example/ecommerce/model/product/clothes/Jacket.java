package com.example.ecommerce.model.product.clothes;

import jakarta.persistence.*;

@Entity
@Table(name = "jackets")
@PrimaryKeyJoinColumn(name = "jacket_id")
@DiscriminatorValue("JACKET")
public class Jacket extends Clothes {
	@Column(name = "jacket_type", nullable = false)
	private String jacketType;

	@Column(name = "has_hood")
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