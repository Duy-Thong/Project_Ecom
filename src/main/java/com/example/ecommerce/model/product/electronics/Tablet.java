package com.example.ecommerce.model.product.electronics;

public class Tablet extends Electronics {
	private String penSupport;
	private Object cellularSupport;

	public String getPenSupport() {
		return this.penSupport;
	}

	public void setPenSupport(String penSupport) {
		this.penSupport = penSupport;
	}

	public void getCellularSupport() {
		return this.cellularSupport;
	}

	public void setCellularSupport(Object cellularSupport) {
		this.cellularSupport = cellularSupport;
	}
}