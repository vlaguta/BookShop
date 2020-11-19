package com.bookShop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "customer_id", insertable = false, updatable = false)
    private Customer customer;
    private Integer status;
    @ManyToMany(mappedBy = "order")
    //@JoinTable(name = "order_book",
    //        joinColumns = @JoinColumn(name = "order_id"),
    //        inverseJoinColumns = @JoinColumn(name = "book_id"))
    private List<Book> books;
    @Column(name = "date")
    private ZonedDateTime dateTime;
    @Column(name = "customer_id")
    private int customerId;

    public Order() {
    }

    public Order(Customer customer) {
        this.customer = customer;
    }

    public Order(Customer customer, Integer status, List<Book> books) {
        this.customer = customer;
        this.status = status;
        this.books = books;
    }

    public Order(int customerId) {
        this.customerId = customerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public ZonedDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(ZonedDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
