package com.bookShop.service;

import com.bookShop.dao.BookRepository;
import com.bookShop.model.Book;

import java.util.List;

public class BookService {

    private final BookRepository bookRepository = new BookRepository();

    public void add(Book book) {
        bookRepository.add(book);
    }

    public void update(Book book) {
        bookRepository.update(book);
    }

    public void remove(Book book) {
        bookRepository.remove(book);
    }

    public Book getBook(int bookId) {
        return bookRepository.getBook(bookId);
    }

    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }
}
