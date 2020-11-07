package com.bookShop;

import com.bookShop.dao.BookRepository;
import com.bookShop.dao.CartRepository;
import com.bookShop.dao.CustomerRepository;
import com.bookShop.model.Cart;
import com.bookShop.model.Customer;

public class Main {
    public static void main(String[] args) {

        new BookShop().start();
    }
}
