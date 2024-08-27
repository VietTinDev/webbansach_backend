package com.viettin.webbansach_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "shipping_method")
public class ShippingMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shippingId;

    @Column(name = "shipping_name")
    private String shippingName;

    @Column(name = "description")
    private String description;

    @Column(name = "payment_fee")
    private double paymentFee;

    @OneToMany(mappedBy = "shippingMethod",fetch = FetchType.LAZY,cascade = {
            CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH
    })
    private List<Order> orders;
}
