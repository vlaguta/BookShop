package com.bookShop.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "cart")
public class Cart {

    @ManyToMany(/*mappedBy = "carts", */cascade = CascadeType.PERSIST)
    @JoinTable(name = "book_cart",
            joinColumns = @JoinColumn(name = "cart_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))

    private List<Book> books;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Cart() {
    }

    public Cart(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public Cart(Customer customer) {
        this.customer = customer;
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

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return id == cart.id &&
                Objects.equals(books, cart.books) &&
                Objects.equals(customer, cart.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books, id, customer);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "books=" + books +
                ", id=" + id +
                ", customer=" + customer +
                '}';
    }
}
