package com.example.ecommerce.model.product.electronics;

import jakarta.persistence.*;

@Entity
@Table(name = "hardware")
public class Hardware {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "hardware_id")
	private String hardwareID;

	@Column(nullable = false)
	private String cpu;

	private String gpu;

	@Column(nullable = false)
	private String ram;

	@Column(nullable = false)
	private String storage;

	@OneToOne(mappedBy = "hardware")
	private Electronics electronics;

	public String getHardwareID() {
		return this.hardwareID;
	}

	public void setHardwareID(String hardwareID) {
		this.hardwareID = hardwareID;
	}

	public String getCpu() {
		return this.cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getGpu() {
		return this.gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public String getRam() {
		return this.ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getStorage() {
		return this.storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public Electronics getElectronics() {
		return electronics;
	}

	public void setElectronics(Electronics electronics) {
		this.electronics = electronics;
	}
}