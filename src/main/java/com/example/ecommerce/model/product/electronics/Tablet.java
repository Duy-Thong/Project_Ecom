package com.example.ecommerce.model.product.electronics;

import jakarta.persistence.*;

@Entity
@Table(name = "tablets")
@PrimaryKeyJoinColumn(name = "tablet_id")
public class Tablet extends Electronics {
	@Column(name = "pen_support")
	private String penSupport;

	@Column(name = "cellular_support")
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