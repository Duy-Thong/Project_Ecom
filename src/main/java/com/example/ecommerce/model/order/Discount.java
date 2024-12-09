package com.example.ecommerce.model.order;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "discounts")
public class Discount {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "discount_id")
	private String discountID;

	@Column(nullable = false, unique = true)
	private String code;

	@Column(nullable = false)
	private int percent;

	@Column(name = "start_date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;

	@Column(name = "end_date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;

	@OneToMany(mappedBy = "discount")
	private List<Order> orders = new ArrayList<>();

	public Discount() {
	}

	public Discount(String discountID, String code, int percent, Date startDate, Date endDate) {
		this.discountID = discountID;
		this.code = code;
		this.percent = percent;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getDiscountID() {
		return this.discountID;
	}

	public void setDiscountID(String discountID) {
		this.discountID = discountID;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getPercent() {
		return this.percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}