package com.viettin.webbansach_backend.entity;

import lombok.Data;

import java.util.List;
@Data
public class Category {
    private int categoryId;
    private String categoryName;
    private List<Book> books;
}
