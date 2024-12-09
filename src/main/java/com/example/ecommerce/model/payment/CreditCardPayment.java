package com.example.ecommerce.model.payment;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "credit_card_payments")
@PrimaryKeyJoinColumn(name = "credit_card_payment_id")
public class CreditCardPayment extends Payment {
	@Column(name = "credit_card_number", nullable = false)
	private String creditCardNumber;

	@Column(name = "card_holder_name", nullable = false)
	private String cardHolderName;

	@Column(name = "expiration_date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date expirationDate;

	@Column(name = "security_code", nullable = false)
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