package com.example.ecommerce.model.user;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Column;

@Embeddable
public class Contact {
	@Column(name = "phone_number")
	private String phoneNumber;

	private String social;

	// Default constructor
	public Contact() {
	}

	// Parameterized constructor
	public Contact(String phoneNumber, String social) {
		this.phoneNumber = phoneNumber;
		this.social = social;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSocial() {
		return this.social;
	}

	public void setSocial(String social) {
		this.social = social;
	}
}