package com.example.ecommerce.model.user;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("INVENTORY_MANAGER")
public class InventoryManager extends User {
    // No additional fields
}