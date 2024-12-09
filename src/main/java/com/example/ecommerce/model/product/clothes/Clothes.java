package com.example.ecommerce.model.product.clothes;

import com.example.ecommerce.model.product.Product;

public class Clothes extends Product {
	private String size;
	private String color;
	private Material material;
	private Brand brand;

	public Clothes() {
		super();
	}

	public Clothes(String id, String name, double price, String description, 
				  String size, String color, Material material, Brand brand) {
		this.size = size;
		this.color = color;
		this.material = material;
		this.brand = brand;
	}

	public Material getMaterial() {
		return this.material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Brand getBrand() {
		return this.brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}