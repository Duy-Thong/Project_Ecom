package com.example.ecommerce.model.product.book;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("EBOOK")
public class Ebook extends Book {
	@Column(name = "file_format")
	private String fileFormat;

	@Column(name = "file_size")
	private double fileSize;

	@Column(name = "download_link")
	private String downloadLink;

	public String getFileFormat() {
		return this.fileFormat;
	}

	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}

	public double getFileSize() {
		return this.fileSize;
	}

	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}

	public String getDownloadLink() {
		return this.downloadLink;
	}

	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}
}