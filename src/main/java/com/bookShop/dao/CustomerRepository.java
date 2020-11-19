package com.bookShop.dao;

import com.bookShop.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class CustomerRepository implements CrudRepository<Customer> {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public void add(Customer customer) {

        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
    }

    public void update(Customer customer) {

        Session session = this.sessionFactory.openSession();
        Transaction transaction;
        transaction = session.beginTransaction();

        session.update(customer);
        transaction.commit();
        session.close();
    }

    public void remove(Customer customer) {

        Session session = this.sessionFactory.openSession();
        Transaction transaction;

        transaction = session.beginTransaction();
        session.delete(customer);
        transaction.commit();
        session.close();

    }

    public Customer getCustomer(int customerId) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction;

        transaction = session.beginTransaction();
        return session.get(Customer.class, customerId);
    }
}
