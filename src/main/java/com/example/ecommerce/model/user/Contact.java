package com.example.ecommerce.model.user;

public class Contact {
	private String phoneNumber;
	private String email;
	private String social;

	// Default constructor
	public Contact() {
	}

	// Parameterized constructor
	public Contact(String phoneNumber, String email, String social) {
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.social = social;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSocial() {
		return this.social;
	}

	public void setSocial(String social) {
		this.social = social;
	}
}