package com.example.ecommerce.model.product.electronics;

public class Hardware {
	private String hardwareID;
	private String cpu;
	private String gpu;
	private String ram;
	private String storage;
	public Electronics electronics;

	public String getHardwareID() {
		return this.hardwareID;
	}

	public void setHardwareID(String iD) {
		this.hardwareID = iD;
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
}