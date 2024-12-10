package com.example.ecommerce.model.payment;

import jakarta.persistence.*;

import java.util.Date;

public class CreditCardPayment extends Payment {
	@Column(name = "credit_card_number")
	private String creditCardNumber;

	@Column(name = "card_holder_name")
	private String cardHolderName;

	@Column(name = "expiration_date")
	@Temporal(TemporalType.DATE)
	private Date expirationDate;

	@Column(name = "security_code")
	private String securityCode;

	@Column(name = "billing_address", columnDefinition = "TEXT")
	private String billingAddress;

	public String getCreditCardNumber() {
		return this.creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getCardHolderName() {
		return this.cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public Date getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getSecurityCode() {
		return this.securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public String getBillingAddress() {
		return this.billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
}