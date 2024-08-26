package com.viettin.webbansach_backend.entity;

import lombok.Data;

import java.util.List;
@Data
public class PaymentMethod {
    private int paymentId;
    private String paymentName;
    private String description;
    private double paymentFee;
    private List<Order> orders;
}
