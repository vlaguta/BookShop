package com.bookShop.controller;

import com.bookShop.model.Book;
import com.bookShop.service.BookService;
import com.google.gson.Gson;

import static spark.Spark.delete;
import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.put;


public class BookController {

    final private BookService bookService = new BookService();

    public void start() {
        port(8082);

        // get("/books", (request, response) -> new Gson().toJson(bookService.getBooks()));

        post("/books", (request, response) -> {
            Book book = new Gson().fromJson(request.body(), Book.class);
            bookService.add(book);
            return "";
        });

        //обновить книгу
        put("/books/:id", (request, response) -> {
            Book book = new Gson().fromJson(request.body(), Book.class);
            bookService.update(book);
            return "";
        });

        //удалить книгу
        delete("/books/:id", (request, response) -> {
            Book book = new Gson().fromJson(request.body(), Book.class);
            bookService.remove(book);
            return "";
        });

    }
}
