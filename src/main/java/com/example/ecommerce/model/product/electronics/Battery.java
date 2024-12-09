package com.example.ecommerce.model.product.electronics;

public class Battery {
	private String batteryID;
	private int capacity;
	private double life;
	private String type;
	public Electronics electronics;

	public String getBatteryID() {
		return this.batteryID;
	}

	public void setBatteryID(String iD) {
		this.batteryID = iD;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getLife() {
		return this.life;
	}

	public void setLife(double life) {
		this.life = life;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
}