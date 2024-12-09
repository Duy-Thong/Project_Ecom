package com.example.ecommerce.model.product.book;

import java.util.ArrayList;

public class Publisher {
	private String publisherID;
	private String name;
	private String address;
	public ArrayList<Book> book = new ArrayList<Book>();

	public String getID() {
		throw new UnsupportedOperationException();
	}

	public void setID(String iD) {
		throw new UnsupportedOperationException();
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
}