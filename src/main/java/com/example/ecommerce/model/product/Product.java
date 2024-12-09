package com.example.ecommerce.model.product;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String productID;
	private String name;
	private String price;
	private int stock;
	private String category;
	private String description;
	private String image_url;
	private List<Rating> ratings;

	public Product() {
		this.ratings = new ArrayList<>();
	}

	public Product(String productID, String name, String price, int stock, 
				  String category, String description, String image_url) {
		this.productID = productID;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.category = category;
		this.description = description;
		this.image_url = image_url;
		this.ratings = new ArrayList<>();
	}

	public String geProductID() {
		throw new UnsupportedOperationException();
	}

	public void setProductID(String iD) {
		this.productID = iD;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Rating> getRatings() {
		throw new UnsupportedOperationException();
	}

	public void setRatings(List<Rating> ratings) {
		throw new UnsupportedOperationException();
	}

	public String getImage_url() {
		return this.image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
}