package com.example.ecommerce.model.product.book;

import com.example.ecommerce.model.product.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Book extends Product {
    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @Column
    private String isbn;

    @Column
    private int pages;

    // Thuộc tính từ PrintedBook
    @Column(name = "paper_type")
    private String paperType;

    // Thuộc tính từ Ebook
    @Column(name = "file_size")
    private double fileSize;
    
    @Column(name = "file_format")
    private String fileFormat;
    
    @Column(name = "download_link")
    private String downloadLink;

    // Thuộc tính từ AudioBook
    @Column(name = "duration")
    private double duration;
    
    @Column(name = "narrator")
    private String narrator;
    
    @Column(name = "audio_format")
    private String audioFormat;

    public Book() {
        super();
    }

    public Book(String productID, String name, double price, int stock,
                String category, String description, String image_url,
                Publisher publisher, Author author, String isbn, int pages,
                String paperType, double fileSize, String fileFormat, 
                String downloadLink, double duration, String narrator, 
                String audioFormat) {
        super(productID, name, price, stock, category, description, image_url);
        this.publisher = publisher;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
        this.paperType = paperType;
        this.fileSize = fileSize;
        this.fileFormat = fileFormat;
        this.downloadLink = downloadLink;
        this.duration = duration;
        this.narrator = narrator;
        this.audioFormat = audioFormat;
    }

    // Getter và setter cho các thuộc tính cũ
    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    // Getter và setter cho thuộc tính từ Ebook
    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    // Getter và setter cho thuộc tính từ AudioBook
    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public String getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
    }

    // Thêm getter và setter cho paperType
    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }
}