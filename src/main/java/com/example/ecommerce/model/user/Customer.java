package com.example.ecommerce.model.user;

import com.example.ecommerce.model.cart.Cart;
import com.example.ecommerce.model.order.Order;
import com.example.ecommerce.model.product.Rating;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("CUSTOMER")
public class Customer extends User {
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cart_id")
	private Cart shoppingCart;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<Order> orderHistory;

	@Column(name = "payment_method")
	private String paymentMethod;

	@Column(name = "shipping_address", columnDefinition = "TEXT")
	private String shippingAddress;

	@OneToMany(mappedBy = "reviewer", cascade = CascadeType.ALL)
	private List<Rating> ratings;

	public Customer() {
		this.orderHistory = new ArrayList<>();
		this.ratings = new ArrayList<>();
	}

	public List<Order> getOrderHistory() {
		return this.orderHistory;
	}

	public void setOrderHistory(List<Order> orderHistory) {
		this.orderHistory = orderHistory;
	}

	public String getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getShippingAddress() {
		return this.shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Cart getShoppingCart() {
		return this.shoppingCart;
	}

	public void setShoppingCart(Cart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
}