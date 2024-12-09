package com.example.ecommerce.model.product.electronics;

public class Laptop extends Electronics {
	private String keyboard;
	private String trackpad;
	private boolean hasTouchscreen;

	public String getKeyboard() {
		return this.keyboard;
	}

	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}

	public String getTrackpad() {
		return this.trackpad;
	}

	public void setTrackpad(String trackpad) {
		this.trackpad = trackpad;
	}

	public boolean getHasTouchscreen() {
		return this.hasTouchscreen;
	}

	public void setHasTouchscreen(boolean hasTouchscreen) {
		this.hasTouchscreen = hasTouchscreen;
	}
}