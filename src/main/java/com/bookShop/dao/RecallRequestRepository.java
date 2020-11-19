package com.bookShop.dao;

import com.bookShop.model.RecallRequest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RecallRequestRepository {

    private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public void add(RecallRequest recallRequest) {

        System.out.println();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();

        session.save(recallRequest);
        transaction.commit();
        session.close();
    }
}
