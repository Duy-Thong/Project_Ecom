package com.example.ecommerce.model.product;

import com.example.ecommerce.model.user.Customer;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ratings")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "rating_id")
    private String ratingID;

    @Column(name = "rating_value")
    private int ratingValue;

    @Column(name = "rating_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ratingDate;

    @Column(columnDefinition = "TEXT")
    private String comment;

    @ManyToOne
    @JoinColumn(name = "reviewer_id")
    private Customer reviewer;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Rating() {
    }

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

    public void setRatingID(String ratingID) {
        this.ratingID = ratingID;
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

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}