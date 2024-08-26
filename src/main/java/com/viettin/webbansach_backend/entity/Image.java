package com.viettin.webbansach_backend.entity;

import lombok.Data;

import java.sql.Blob;
@Data
public class Image {
    private int imageId;
    private String imageName;
    private boolean icons;
    private String link;
    private Blob dataImage;
    private Book book;
}
