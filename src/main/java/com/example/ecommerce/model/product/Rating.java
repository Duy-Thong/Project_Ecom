package com.example.ecommerce.model.product;

import com.example.ecommerce.model.user.Customer;

import java.util.Date;

public class Rating {
    private String ratingID;
    private int ratingValue;
    private Date ratingDate;
    private String comment;
    private Customer reviewer;

    // Default constructor
    public Rating() {
    }

    // Parameterized constructor
    public Rating(String ratingID, int ratingValue, Date ratingDate, String comment, Customer reviewer) {
        this.ratingID = ratingID;
        this.ratingValue = ratingValue;
        this.ratingDate = ratingDate;
        this.comment = comment;
        this.reviewer = reviewer;
    }

    public String getRatingID() {
        return this.ratingID;
    }

    public void setRatingID(String iD) {
        this.ratingID = iD;
    }

    public int getRatingValue() {
        return this.ratingValue;
    }

    public void setRatingValue(int ratingValue) {
        this.ratingValue = ratingValue;
    }

    public Date getRatingDate() {
        return this.ratingDate;
    }

    public void setRatingDate(Date ratingDate) {
        this.ratingDate = ratingDate;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Customer getReviewer() {
        return this.reviewer;
    }

    public void setReviewer(Customer reviewer) {
        this.reviewer = reviewer;
    }
}