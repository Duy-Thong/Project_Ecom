package com.example.ecommerce.model.product.book;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("AUDIO_BOOK")
public class AudioBook extends Book {
	@Column(name = "duration")
	private double duration;

	public double getDuration() {
		return this.duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
}