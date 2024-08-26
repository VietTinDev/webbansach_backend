package com.viettin.webbansach_backend.entity;

import lombok.Data;

import java.util.List;
@Data
public class ShippingMethod {
    private int shippingId;
    private String shippingName;
    private String description;
    private double paymentFee;
    private List<Order> orders;
}
