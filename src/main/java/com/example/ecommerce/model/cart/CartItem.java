package com.example.ecommerce.model.cart;

import com.example.ecommerce.model.product.Product;
import jakarta.persistence.*;

@Entity
@Table(name = "cart_items")
public class CartItem {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "cart_item_id")
	private String cartItemID;

	@Column
	private int quantity;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

	@ManyToOne
	@JoinColumn(name = "cart_id")
	private Cart cart;

	public CartItem(String cartItemID, int quantity, Product product) {
		this.cartItemID = cartItemID;
		this.quantity = quantity;
		this.product = product;
	}

	public CartItem() {
	}

	public String getCartItemID() {
		return this.cartItemID;
	}

	public void setCartItemID(String cartItemID) {
		this.cartItemID = cartItemID;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
}