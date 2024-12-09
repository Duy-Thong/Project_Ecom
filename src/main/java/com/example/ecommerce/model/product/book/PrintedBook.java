package com.example.ecommerce.model.product.book;

import jakarta.persistence.*;

@Entity
@Table(name = "printed_books")
@PrimaryKeyJoinColumn(name = "printed_book_id")
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