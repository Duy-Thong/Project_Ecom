package com.example.ecommerce.model.product.book;

import com.example.ecommerce.model.product.Product;
import jakarta.persistence.*;

@Entity
@Table(name = "books")
@PrimaryKeyJoinColumn(name = "book_id")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "book_type")
public class Book extends Product {
    @Column(unique = true)
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
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