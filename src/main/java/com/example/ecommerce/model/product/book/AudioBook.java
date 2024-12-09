package com.example.ecommerce.model.product.book;

import jakarta.persistence.*;

@Entity
@Table(name = "audiobooks")
@PrimaryKeyJoinColumn(name = "audiobook_id")
public class AudioBook extends Book {
	@Column(nullable = false)
	private double duration;

	public double getDuration() {
		return this.duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
}