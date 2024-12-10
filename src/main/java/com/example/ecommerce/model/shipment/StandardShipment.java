package com.example.ecommerce.model.shipment;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("STANDARD")
public class StandardShipment extends Shipment {
    // No additional fields
}