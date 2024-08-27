package com.viettin.webbansach_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    @Column(name = "name_book")
    private String nameBook;

    @Column(name = "authors")
    private String authors;

    @Column(name = "isbn")
    private int ISBN;

    @Column(name = "description")
    private String description;

    @Column(name = "original_price")
    private double OriginalPrice;

    @Column(name = "sell_price")
    private double SellingPrice;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "rating")
    private double rating;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH
    })
    @JoinTable(name = "book_category",
     joinColumns = @JoinColumn(name = "book_id"),
     inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories;

    @OneToMany(mappedBy = "book",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Image> images;

    @OneToMany(mappedBy = "book",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Evaluation> evaluations;

    @OneToMany(mappedBy = "book",fetch = FetchType.LAZY,cascade = {
            CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH
    })
    private List<OrderDetails> orderDetails;

    @OneToMany(mappedBy = "book",fetch = FetchType.LAZY,cascade = {
            CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH
    })
    private List<WishList> wishLists;

}
