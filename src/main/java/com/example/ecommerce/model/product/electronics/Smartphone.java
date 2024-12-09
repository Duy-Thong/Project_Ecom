package com.example.ecommerce.model.product.electronics;

import jakarta.persistence.*;

@Entity
@Table(name = "smartphones")
@PrimaryKeyJoinColumn(name = "smartphone_id")
public class Smartphone extends Electronics {
	@Column(name = "camera_resolution", nullable = false)
	private int cameraResolution;

	@Column(name = "sim_count", nullable = false)
	private int simCount;

	@Column(name = "fingerprint_sensor")
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