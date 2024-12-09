package com.example.ecommerce.model.product;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
@Inheritance(strategy = InheritanceType.JOINED)
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "product_id")
	private String productID;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String price;

	@Column(nullable = false)
	private int stock;

	@Column(nullable = false)
	private String category;

	@Column(columnDefinition = "TEXT")
	private String description;

	@Column(name = "image_url")
	private String image_url;

	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
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

	public String getProductID() {
		return this.productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
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
		return this.ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public String getImage_url() {
		return this.image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
}