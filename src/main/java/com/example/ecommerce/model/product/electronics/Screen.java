package com.example.ecommerce.model.product.electronics;

public class Screen {
	private String screenID;
	private String resolution;
	private double size;
	private int refreshRate;
	private String displayType;
	public Electronics electronics;

	public String getScreenID() {
		return this.screenID;
	}

	public void setScreenID(String iD) {
		this.screenID = iD;
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
}