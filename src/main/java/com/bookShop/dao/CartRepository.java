package com.bookShop.dao;

import com.bookShop.model.Book;
import com.bookShop.model.Cart;
import com.bookShop.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;

public class CartRepository {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public void add(Customer customer) { //вызывать в сервисе при создании юзера

        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();

        Cart cart = new Cart(customer);
        session.save(cart);
        transaction.commit();
        session.close();
    }

    public void addBook(int cartId, Book book) {

        Session session = this.sessionFactory.openSession();
        Transaction transaction;

        transaction = session.beginTransaction();
        Cart cart = session.get(Cart.class, cartId);
        List<Book> books = cart.getBooks();
        books.add(book);
        cart.setBooks(books);
        session.update(cart);
        transaction.commit();
        session.close();
    }

    public void removeBook(int cartId, Book book) {

        Session session = this.sessionFactory.openSession();
        Transaction transaction;
        transaction = session.beginTransaction();
        Cart cart = session.get(Cart.class, cartId);
        List<Book> books = cart.getBooks();
        books.remove(book);
        cart.setBooks(books);
        session.update(cart);
        transaction.commit();
        session.close();
    }

    public void remove(Cart cart) {

        Session session = this.sessionFactory.openSession();
        Transaction transaction;

        transaction = session.beginTransaction();
        session.delete(cart);
        transaction.commit();
        session.close();
    }

    public void clean(int cartId) {

        Session session = this.sessionFactory.openSession();
        Transaction transaction;

        transaction = session.beginTransaction();
        Cart cart = session.get(Cart.class, cartId);
        cart.setBooks(null);
        session.update(cart);
        transaction.commit();
        session.close();
    }

    public Cart getCart(int cartId) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction;

        transaction = session.beginTransaction();
        return session.get(Cart.class, cartId);
    }
}
