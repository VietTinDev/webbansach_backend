package com.viettin.webbansach_backend.entity;

import lombok.Data;

import java.util.List;
@Data
public class User {
    private int userId;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private boolean gender;
    private String phoneNumber;
    private String billingAddress;
    private String shippingAddress;
    private List<Role> roles;
    private List<Evaluation> evaluations;
    private List<WishList> wishLists;
    private List<Order> orders;
}
