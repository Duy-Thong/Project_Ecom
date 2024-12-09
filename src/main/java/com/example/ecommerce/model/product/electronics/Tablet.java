package com.example.ecommerce.model.product.electronics;

public class Tablet extends Electronics {
	private String penSupport;
	private String cellularSupport;

	public String getPenSupport() {
		return this.penSupport;
	}

	public void setPenSupport(String penSupport) {
		this.penSupport = penSupport;
	}

	public String getCellularSupport() {
		return this.cellularSupport;
	}

	public void setCellularSupport(String cellularSupport) {
		this.cellularSupport = cellularSupport;
	}
}