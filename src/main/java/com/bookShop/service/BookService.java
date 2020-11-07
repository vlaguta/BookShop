package com.bookShop.service;

import com.bookShop.dao.BookRepository;
import com.bookShop.dao.CrudRepository;
import com.bookShop.model.Book;

public class BookService {

    private final CrudRepository<Book> bookRepository = new BookRepository();

    public void add(Book book){
        bookRepository.add(book);
    }

    public void update(Book book){
        bookRepository.update(book);
    }

    public void remove(Book book){
        bookRepository.remove(book);
    }
}
