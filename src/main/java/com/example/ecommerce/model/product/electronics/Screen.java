package com.example.ecommerce.model.product.electronics;

import jakarta.persistence.*;

@Entity
@Table(name = "screens")
public class Screen {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "screen_id")
	private String screenID;

	@Column(nullable = false)
	private String resolution;

	@Column(nullable = false)
	private double size;

	@Column(name = "refresh_rate", nullable = false)
	private int refreshRate;

	@Column(name = "display_type", nullable = false)
	private String displayType;

	@OneToOne(mappedBy = "screen")
	private Electronics electronics;

	public String getScreenID() {
		return this.screenID;
	}

	public void setScreenID(String screenID) {
		this.screenID = screenID;
	}

	public String getResolution() {
		return this.resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public double getSize() {
		return this.size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public int getRefreshRate() {
		return this.refreshRate;
	}

	public void setRefreshRate(int refreshRate) {
		this.refreshRate = refreshRate;
	}

	public String getDisplayType() {
		return this.displayType;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	public Electronics getElectronics() {
		return electronics;
	}

	public void setElectronics(Electronics electronics) {
		this.electronics = electronics;
	}
}