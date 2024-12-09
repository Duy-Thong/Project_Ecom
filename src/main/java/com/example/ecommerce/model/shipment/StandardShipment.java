package com.example.ecommerce.model.shipment;

import jakarta.persistence.*;

@Entity
@Table(name = "standard_shipments")
@PrimaryKeyJoinColumn(name = "standard_shipment_id")
public class StandardShipment extends Shipment {
}