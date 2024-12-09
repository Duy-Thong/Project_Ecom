package com.example.ecommerce.model.payment;

public class Payment {
	private String paymentID;
	private String type;
	private String amount;
	private Date paymentDate;
	private PaymentStatus status;
	private String method;
	public Order order;
	public PaymentStatus paymentStatus;

	public String getPaymentID() {
		return this.paymentID;
	}

	public void setPaymentID(String iD) {
		this.paymentID = iD;
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