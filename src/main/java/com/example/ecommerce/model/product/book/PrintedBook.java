package com.example.ecommerce.model.product.book;

import jakarta.persistence.*;

public class PrintedBook extends Book {
	@Column(name = "paper_type")
	private String paperType;

	public String getPaperType() {
		return this.paperType;
	}

	public void setPaperType(String paperType) {
		this.paperType = paperType;
	}
}