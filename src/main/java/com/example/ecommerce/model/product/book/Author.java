package com.example.ecommerce.model.product.book;

import java.util.ArrayList;

public class Author {
	private String authorID;
	private String name;
	private String phone;
	private String email;
	public ArrayList<Book> book = new ArrayList<Book>();

	public String getauthorID() {
		throw new UnsupportedOperationException();
	}

	public void setauthorID(String iD) {
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Book> getListBooks() {
		throw new UnsupportedOperationException();
	}

	public void setListBooks(List<Book> listBooks) {
		throw new UnsupportedOperationException();
	}
}