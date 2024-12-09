package com.example.ecommerce.model.product.book;

import com.example.ecommerce.model.product.Product;

public class Book extends Product {
    private String isbn;
    private Author author;
    private Publisher publisher;

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return this.publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }


}