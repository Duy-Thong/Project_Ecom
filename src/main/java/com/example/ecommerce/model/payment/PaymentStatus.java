package com.example.ecommerce.model.payment;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "payment_statuses")
public class PaymentStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "status_id")
    private String statusID;

    @Column(name = "status_name", nullable = false, unique = true)
    private String paymentStatusName;

    @OneToMany(mappedBy = "status")
    private List<Payment> payments = new ArrayList<>();

    public PaymentStatus() {
    }

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

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}