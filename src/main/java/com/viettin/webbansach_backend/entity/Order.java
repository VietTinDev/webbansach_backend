package com.viettin.webbansach_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "bill_address")
    private String billingAddress;

    @Column(name = "ship_address")
    private String shippingAddress;

    @Column(name = "total_price_product")
    private double totalPriceProduct;

    @Column(name = "delivery_fee")
    private double deliveryFee;

    @Column(name = "payment_fee")
    private double paymentFee;

    @Column(name = "total_price")
    private double totalPrice;

    @OneToMany(mappedBy = "order",fetch = FetchType.LAZY,cascade = {
            CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH
    })
    private List<OrderDetails> orderDetails;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "payment_id")
    private PaymentMethod paymentMethod;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "shipping_id")
    private ShippingMethod shippingMethod;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "user_id")
    private User user;
}
