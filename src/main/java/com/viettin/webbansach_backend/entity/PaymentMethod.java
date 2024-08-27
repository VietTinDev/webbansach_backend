package com.viettin.webbansach_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "payment_method")
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentId;

    @Column(name = "payment_name")
    private String paymentName;

    @Column(name = "description")
    private String description;

    @Column(name = "payment_fee")
    private double paymentFee;

    @OneToMany(mappedBy = "paymentMethod",fetch = FetchType.LAZY,cascade = {
            CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH
    })
    private List<Order> orders;
}
