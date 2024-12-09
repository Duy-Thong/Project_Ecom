package com.example.ecommerce.model.cart;

import com.example.ecommerce.model.user.Customer;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "carts")
public class Cart {
	@Id
	@Column(name = "cart_id")
	private String cartID;

	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CartItem> items = new ArrayList<>();

	public Cart(String cartID, List<CartItem> items) {
		this.cartID = cartID;
		this.items = items;
	}

	public Cart(String cartID) {
		this.cartID = cartID;
		this.items = new ArrayList<>();
	}

	public Cart() {
	}

	public String getCartID() {
		return this.cartID;
	}

	public void setCartID(String iD) {
		this.cartID = iD;
	}

	public List<CartItem> getItems() {
		return this.items;
	}

	public void setItems(List<CartItem> items) {
		this.items = items;
	}
}