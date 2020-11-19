package com.bookShop.dao;

import com.bookShop.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class BookRepository implements CrudRepository<Book> {

    private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public void add(Book book) {

        System.out.println();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();

        session.save(book);
        transaction.commit();
        session.close();
    }

    public void update(Book book) {

        Session session = this.sessionFactory.openSession();
        Transaction transaction;

        transaction = session.beginTransaction();

        session.update(book);
        transaction.commit();
        session.close();
    }

    public void remove(Book book) {

        Session session = this.sessionFactory.openSession();
        Transaction transaction;

        transaction = session.beginTransaction();
        session.delete(book);
        transaction.commit();
        session.close();
    }

    public Book getBook(int bookId) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction;

        transaction = session.beginTransaction();
        return session.get(Book.class, bookId);
    }

    public List<Book> getBooks() {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String sql = "From " + Book.class.getSimpleName();
        System.out.println("sql = " + sql);
        List<Book> books = session.createQuery(sql).list();
        transaction.commit();
        session.close();
        return books;
    }

    //public List<Book> getAllBooks(){
    //    Session session = this.sessionFactory.openSession();
    //    Transaction transaction;
    //
    //    transaction = session.beginTransaction();
    //    return session.get(Book.class, bookId);
    //}
}
