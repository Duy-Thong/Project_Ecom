package com.example.ecommerce.model.product.electronics;

import com.example.ecommerce.model.product.Product;
import com.example.ecommerce.model.product.clothes.Brand;
import jakarta.persistence.*;

@Entity
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

	@Column
	private String keyboard;

	@Column
	private String trackpad;

	@Column(name = "has_touchscreen")
	private boolean hasTouchscreen;

	@Column(name = "camera_resolution")
	private int cameraResolution;

	@Column(name = "sim_count")
	private int simCount;

	@Column(name = "fingerprint_sensor")
	private boolean fingerprintSensor;

	@Column(name = "pen_support")
	private String penSupport;

	@Column(name = "cellular_support")
	private String cellularSupport;

	public Electronics() {
		super();
	}

	public Electronics(String productID, String name, double price, int stock,
					   String category, String description, String image_url,
					   String os, Brand brand, Hardware hardware, Screen screen, Battery battery,
					   String keyboard, String trackpad, boolean hasTouchscreen,
					   int cameraResolution, int simCount, boolean fingerprintSensor,
					   String penSupport, String cellularSupport) {
		super(productID, name, price, stock, category, description, image_url);
		this.os = os;
		this.brand = brand;
		this.hardware = hardware;
		this.screen = screen;
		this.battery = battery;
		this.keyboard = keyboard;
		this.trackpad = trackpad;
		this.hasTouchscreen = hasTouchscreen;
		this.cameraResolution = cameraResolution;
		this.simCount = simCount;
		this.fingerprintSensor = fingerprintSensor;
		this.penSupport = penSupport;
		this.cellularSupport = cellularSupport;
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

	public String getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}

	public String getTrackpad() {
		return trackpad;
	}

	public void setTrackpad(String trackpad) {
		this.trackpad = trackpad;
	}

	public boolean getHasTouchscreen() {
		return hasTouchscreen;
	}

	public void setHasTouchscreen(boolean hasTouchscreen) {
		this.hasTouchscreen = hasTouchscreen;
	}

	public int getCameraResolution() {
		return cameraResolution;
	}

	public void setCameraResolution(int cameraResolution) {
		this.cameraResolution = cameraResolution;
	}

	public int getSimCount() {
		return simCount;
	}

	public void setSimCount(int simCount) {
		this.simCount = simCount;
	}

	public boolean getFingerprintSensor() {
		return fingerprintSensor;
	}

	public void setFingerprintSensor(boolean fingerprintSensor) {
		this.fingerprintSensor = fingerprintSensor;
	}

	public String getPenSupport() {
		return penSupport;
	}

	public void setPenSupport(String penSupport) {
		this.penSupport = penSupport;
	}

	public String getCellularSupport() {
		return cellularSupport;
	}

	public void setCellularSupport(String cellularSupport) {
		this.cellularSupport = cellularSupport;
	}
}