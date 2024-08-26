package com.viettin.webbansach_backend.entity;

import lombok.Data;

@Data
public class WishList {
    private int wishListId;
    private User user;
    private Book book;
}
