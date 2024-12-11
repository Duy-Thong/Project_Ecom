package com.example.ecommerce.model.product.clothes;

import com.example.ecommerce.model.product.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "clothes_type")
@DiscriminatorValue("CLOTHES")
public class Clothes extends Product {
	@Column
	private String size;

	@Column
	private String color;

	@ManyToOne
	@JoinColumn(name = "material_id")
	private Material material;

	@ManyToOne
	@JoinColumn(name = "brand_id")
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
}