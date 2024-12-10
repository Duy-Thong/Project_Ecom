package com.example.ecommerce.model.product.electronics;

import com.example.ecommerce.model.product.Product;
import com.example.ecommerce.model.product.clothes.Brand;
import jakarta.persistence.*;

@Entity
@Table(name = "electronics")
@PrimaryKeyJoinColumn(name = "electronics_id")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "electronics_type")
public class Electronics extends Product {
	@Column
	private String os;

	@ManyToOne
	@JoinColumn(name = "brand_id")
	private Brand brand;

	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "hardware_id")
	private Hardware hardware;

	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "screen_id")
	private Screen screen;

	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "battery_id")
	private Battery battery;

	public Brand getBrand() {
		return this.brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getOs() {
		return this.os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public Hardware getHardware() {
		return this.hardware;
	}

	public void setHardware(Hardware hardware) {
		this.hardware = hardware;
	}

	public Screen getScreen() {
		return this.screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Battery getBattery() {
		return this.battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}
}