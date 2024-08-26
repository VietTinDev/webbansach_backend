package com.viettin.webbansach_backend.entity;

import lombok.Data;

import java.util.List;
@Data
public class Book {
    private int bookId;
    private String nameBook;
    private String authors;
    private int ISBN;
    private String description;
    private double OriginalPrice;
    private double SellingPrice;
    private int quantity;
    private double rating;
    private List<Category> categories;
    private List<Image> images;
    private List<Evaluation> evaluations;
    private List<OrderDetails> orderDetails;
    private List<WishList> wishLists;

}
