package com.viettin.webbansach_backend.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imageId;

    @Column(name = "image_name")
    private String imageName;

    @Column(name = "icon")
    private boolean icons;

    @Column(name = "link")
    private String link;

    @Column(name = "data_image")
    @Lob
    private String dataImage;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "book_id",nullable = false)
    private Book book;
}
