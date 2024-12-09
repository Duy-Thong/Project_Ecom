package com.example.ecommerce.model.product.electronics;

import jakarta.persistence.*;

@Entity
@Table(name = "batteries")
public class Battery {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "battery_id")
	private String batteryID;

	@Column(nullable = false)
	private int capacity;

	@Column(nullable = false)
	private double life;

	@Column(nullable = false)
	private String type;

	@OneToOne(mappedBy = "battery")
	private Electronics electronics;

	public String getBatteryID() {
		return this.batteryID;
	}

	public void setBatteryID(String batteryID) {
		this.batteryID = batteryID;
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

	public Electronics getElectronics() {
		return electronics;
	}

	public void setElectronics(Electronics electronics) {
		this.electronics = electronics;
	}
}