package com.example.ecommerce.model.user;

public class FullName {
	private String firstName;
	private String lastName;
	private String middleName;

	// Constructor
	public FullName(String firstName, String lastName, String middleName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
}