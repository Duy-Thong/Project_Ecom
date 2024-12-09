package com.example.ecommerce.model.product.book;

public class PrintedBook extends Book {
	private String paperType;

	public String getPaperType() {
		return this.paperType;
	}

	public void setPaperType(String paperType) {
		this.paperType = paperType;
	}
}