package com.bookShop.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "customer")

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Cart cart;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private String patronymic;
    private String phone;
    private String email;
    @OneToMany(mappedBy = "customer")
    private List<Order> order;
    //@OneToOne(mappedBy)
    //private RecallRequest recallRequest;

    public Customer() {
    }

    public Customer(String name,
                    String lastName,
                    String patronymic,
                    String phone,
                    String email) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.phone = phone;
        this.email = email;
    }

    public Customer(int id, String name, String lastName, String patronymic, String phone, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

