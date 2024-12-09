package com.example.ecommerce.model.product.book;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String authorID;
    private String name;
    private String phone;
    private String email;
    private List<Book> book = new ArrayList<>();

    public String getauthorID() {
        return this.authorID;
    }

    public void setauthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Book> getListBooks() {
        return this.book;
    }

    public void setListBooks(List<Book> listBooks) {
        this.book = listBooks;
    }
}