package com.viettin.webbansach_backend.entity;

import lombok.Data;

@Data
public class Evaluation {
    private long evaluateId;
    private float ratingPoint;
    private String comment;
    private Book book;
    private User user;
}
