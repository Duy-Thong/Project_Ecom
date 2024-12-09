package com.example.ecommerce.model.payment;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payments")
@Inheritance(strategy = InheritanceType.JOINED)
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "payment_id")
	private String paymentID;

	@Column(nullable = false)
	private String type;

	@Column(nullable = false)
	private String amount;

	@Column(name = "payment_date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date paymentDate;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "status_id", nullable = false)
	private PaymentStatus status;

	@Column(nullable = false)
	private String method;

	public Payment() {
	}

	public Payment(String paymentID, String type, String amount, Date paymentDate, PaymentStatus status, String method) {
		this.paymentID = paymentID;
		this.type = type;
		this.amount = amount;
		this.paymentDate = paymentDate;
		this.status = status;
		this.method = method;
	}

	public String getPaymentID() {
		return this.paymentID;
	}

	public void setPaymentID(String paymentID) {
		this.paymentID = paymentID;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public PaymentStatus getStatus() {
		return this.status;
	}

	public void setStatus(PaymentStatus status) {
		this.status = status;
	}

	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}
}