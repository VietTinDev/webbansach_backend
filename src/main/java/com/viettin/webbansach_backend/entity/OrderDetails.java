package com.viettin.webbansach_backend.entity;

import lombok.Data;

@Data
public class OrderDetails {
    private int orderDetailId;
    private int quantity;
    private double sellingPrice;
    private Book book;
    private Order order;
}
