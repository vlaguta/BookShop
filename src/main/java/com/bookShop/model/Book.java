package com.bookShop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String author;
    private String genre;
    private double price;
    @Column(name = "publishing_house")
    private String publishingHouse;
    private String language;
    private int count;
    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false) //cart_id
    private Cart cart;
    @ManyToMany
    @JoinTable(name = "order_book",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id"))
    private List<Order> orders;

    public Book() {
    }

    public Book(String name,
                String author,
                String genre,
                double price,
                String publishingHouse,
                String language,
                int count) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.publishingHouse = publishingHouse;
        this.language = language;
        this.count = count;
    }

    public Book(int id, String name, String author, String genre, double price, String publishingHouse, String language, int count) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.publishingHouse = publishingHouse;
        this.language = language;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
