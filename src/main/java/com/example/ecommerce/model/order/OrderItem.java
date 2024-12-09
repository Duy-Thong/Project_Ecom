package com.example.ecommerce.model.order;

import com.example.ecommerce.model.product.Product;

public class OrderItem {
    private String orderItemID;
    private int quantity;
    private Product product;

    // Default constructor
    public OrderItem() {
    }

    // Parameterized constructor
    public OrderItem(String orderItemID, int quantity, Product product) {
        this.orderItemID = orderItemID;
        this.quantity = quantity;
        this.product = product;
    }

    public String getOrderItemID() {
        return this.orderItemID;
    }

    public void setOrderItemID(String iD) {
        this.orderItemID = iD;
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
}