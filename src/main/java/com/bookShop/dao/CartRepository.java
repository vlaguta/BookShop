package com.bookShop.dao;

import com.bookShop.model.Cart;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

public class CartRepository implements CrudRepository<Cart>{

    private static final Scanner SCANNER = new Scanner(System.in);
    private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public void add(Cart cart) {

        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        session.save(cart);
        transaction.commit();
        session.close();
    }

    public void update(Cart cart) {

        Session session = this.sessionFactory.openSession();
        Transaction transaction;

        transaction = session.beginTransaction();
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
}
