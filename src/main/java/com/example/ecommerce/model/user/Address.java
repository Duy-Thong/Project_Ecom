package com.example.ecommerce.model.user;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Column;

@Embeddable
public class Address {
	@Column
	private String city;

	@Column
	private String state;

	@Column(name = "postal_code")
	private String postalCode;

	@Column
	private String country;

	public Address() {
	}

	public Address(String city, String state, String postalCode, String country) {
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}