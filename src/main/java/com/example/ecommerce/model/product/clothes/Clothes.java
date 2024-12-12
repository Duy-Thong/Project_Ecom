package com.example.ecommerce.model.product.clothes;

import com.example.ecommerce.model.product.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
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

	@Column
	private String style;
	
	@Column
	private String length;

	@Column
	private String sleeveType;

	@Column
	private String fit;

	@Column
	private String waistSize;

	@Column
	private String neckType;

	@Column(name = "dress_length")
	private double dressLength;

	@Column(name = "dress_type")
	private double dressType;

	@Column(name = "jacket_type")
	private String jacketType;

	@Column(name = "has_hood")
	private boolean hasHood;

	@Column(name = "fit_type", nullable = false)
	private String fitType;

	@Column(name = "sleeve_length", nullable = false)
	private double sleeveLength;

	@Column(name = "shirt_type", nullable = false)
	private String shirtType;

	public Clothes() {
		super();
	}

	public Clothes(String productID, String name, double price, int stock,
				   String category, String description, String image_url,
				   String size, String color, Material material, Brand brand,
				   String style, String length, String sleeveType,
				   String fit, String waistSize, String neckType,
				    double dressLength, double dressType,
				   String jacketType, boolean hasHood, String fitType,
				   double sleeveLength, String shirtType) {
		super(productID, name, price, stock, category, description, image_url);
		this.size = size;
		this.color = color;
		this.material = material;
		this.brand = brand;
		this.style = style;
		this.length = length;
		this.sleeveType = sleeveType;
		this.fit = fit;
		this.waistSize = waistSize;
		this.neckType = neckType;
		this.dressLength = dressLength;
		this.dressType = dressType;
		this.jacketType = jacketType;
		this.hasHood = hasHood;
		this.fitType = fitType;
		this.sleeveLength = sleeveLength;
		this.shirtType = shirtType;
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

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getSleeveType() {
		return sleeveType;
	}

	public void setSleeveType(String sleeveType) {
		this.sleeveType = sleeveType;
	}

	public String getFit() {
		return fit;
	}

	public void setFit(String fit) {
		this.fit = fit;
	}

	public String getWaistSize() {
		return waistSize;
	}

	public void setWaistSize(String waistSize) {
		this.waistSize = waistSize;
	}

	public String getNeckType() {
		return neckType;
	}

	public void setNeckType(String neckType) {
		this.neckType = neckType;
	}

	public double getDressLength() {
		return dressLength;
	}

	public void setDressLength(double dressLength) {
		this.dressLength = dressLength;
	}

	public double getDressType() {
		return dressType;
	}

	public void setDressType(double dressType) {
		this.dressType = dressType;
	}

	public String getJacketType() {
		return jacketType;
	}

	public void setJacketType(String jacketType) {
		this.jacketType = jacketType;
	}

	public boolean getHasHood() {
		return hasHood;
	}

	public void setHasHood(boolean hasHood) {
		this.hasHood = hasHood;
	}

	public String getFitType() {
		return fitType;
	}

	public void setFitType(String fitType) {
		this.fitType = fitType;
	}

	public double getSleeveLength() {
		return sleeveLength;
	}

	public void setSleeveLength(double sleeveLength) {
		this.sleeveLength = sleeveLength;
	}

	public String getShirtType() {
		return shirtType;
	}

	public void setShirtType(String shirtType) {
		this.shirtType = shirtType;
	}
}