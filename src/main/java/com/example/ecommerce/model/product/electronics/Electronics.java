package com.example.ecommerce.model.product.electronics;

import com.example.ecommerce.model.product.Product;
import com.example.ecommerce.model.product.clothes.Brand;

public class Electronics extends Product {
	private String os;
	private Brand brand;
	private Hardware hardware;
	private Screen screen;
	private Battery battery;

	public String getID() {
		throw new UnsupportedOperationException();
	}

	public void setProductID(String iD) {
		throw new UnsupportedOperationException();
	}

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