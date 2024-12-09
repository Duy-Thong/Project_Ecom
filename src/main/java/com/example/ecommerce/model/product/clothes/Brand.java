package com.example.ecommerce.model.product.clothes;

import com.example.ecommerce.model.product.electronics.Electronics;

public class Brand {
	private String brandID;
	private String name;
	private String address;
	private String description;
	private int yearEstablished;
	public Clothes clothes;
	public Electronics electronics;

	// Default constructor
	public Brand() {
	}

	// Parameterized constructor
	public Brand(String brandID, String name, String address, String description, int yearEstablished) {
		this.brandID = brandID;
		this.name = name;
		this.address = address;
		this.description = description;
		this.yearEstablished = yearEstablished;
	}

	public String getBrandID() {
		return this.brandID;
	}

	public void setBrandID(String iD) {
		this.brandID = iD;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getYearEstablished() {
		return this.yearEstablished;
	}

	public void setYearEstablished(int yearEstablished) {
		this.yearEstablished = yearEstablished;
	}
}