package com.bookShop.dao;

import com.bookShop.model.Order;
import com.bookShop.model.Status;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class OrderRepository {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public void add() {

        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Order order = new Order();
        session.save(order);
        transaction.commit();
        session.close();
    }

    public void update(Order order) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(order);
        transaction.commit();
        session.close();
    }

    public void remove(Order order) {

        Session session = this.sessionFactory.openSession();
        Transaction transaction;

        transaction = session.beginTransaction();
        session.delete(order);
        transaction.commit();
        session.close();
    }
}
