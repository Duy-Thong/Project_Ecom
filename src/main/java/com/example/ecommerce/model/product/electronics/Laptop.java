package com.example.ecommerce.model.product.electronics;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("LAPTOP")
public class Laptop extends Electronics {
	@Column
	private String keyboard;

	private String trackpad;

	@Column(name = "has_touchscreen")
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