package com.example.ecommerce.model.payment;

import java.util.ArrayList;

public class PaymentStatus {
    private String statusID;
    private String paymentStatusName;

    // Default constructor
    public PaymentStatus() {
    }

    // Parameterized constructor
    public PaymentStatus(String statusID, String paymentStatusName) {
        this.statusID = statusID;
        this.paymentStatusName = paymentStatusName;
    }

    public String getStatusID() {
        return this.statusID;
    }

    public void setStatusID(String statusID) {
        this.statusID = statusID;
    }

    public String getPaymentStatusName() {
        return this.paymentStatusName;
    }

    public void setPaymentStatusName(String paymentStatusName) {
        this.paymentStatusName = paymentStatusName;
    }
}