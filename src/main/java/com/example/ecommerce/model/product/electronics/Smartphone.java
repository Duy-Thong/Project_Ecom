package com.example.ecommerce.model.product.electronics;

public class Smartphone extends Electronics {
	private int cameraResolution;
	private int simCount;
	private boolean fingerprintSensor;

	public int getCameraResolution() {
		return this.cameraResolution;
	}

	public void setCameraResolution(int cameraResolution) {
		this.cameraResolution = cameraResolution;
	}

	public int getSimCount() {
		return this.simCount;
	}

	public void setSimCount(int simCount) {
		this.simCount = simCount;
	}

	public boolean getFingerprintSensor() {
		return this.fingerprintSensor;
	}

	public void setFingerprintSensor(boolean fingerprintSensor) {
		this.fingerprintSensor = fingerprintSensor;
	}
}