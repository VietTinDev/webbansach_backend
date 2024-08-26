package com.viettin.webbansach_backend.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private int orderId;
    private Date createdDate;
    private String billingAddress;
    private String shippingAddress;
    private double totalPriceProduct;
    private double deliveryFee;
    private double paymentFee;
    private double totalPrice;
    private  PaymentMethod paymentMethod;
    private ShippingMethod shippingMethod;
    private User user;
}
