package com.bookShop;

import com.bookShop.dao.BookRepository;
import com.bookShop.dao.CartRepository;
import com.bookShop.dao.CustomerRepository;
import com.bookShop.service.BookService;
import com.bookShop.service.CartService;
import com.bookShop.service.CustomerService;
import com.bookShop.service.OrderService;

public class Main {
    public static void main(String[] args) {

        //new BookShop().start();

        BookService bookService = new BookService();
        BookRepository bookRepository = new BookRepository();
        CartRepository cartRepository = new CartRepository();
        CustomerRepository customerRepository = new CustomerRepository();
        CartService cartService = new CartService();
        CustomerService customerService = new CustomerService();
        OrderService orderService = new OrderService();
        //bookService.add(new Book("1984", "Oруэлл", "антиутопия", 22, "faff", "русский", 3));

        //CartService cartService = new CartService();
        cartService.addBook(2, bookRepository.getBook(2));
        //cartRepository.add(customerRepository.getCustomer(2));
        //CustomerService customerService = new CustomerService();
        //customerService.add(new Customer("Алина", "Иванова", "Сергеевна", "55555", "akak@mail.com"));
        // cartService.remove(cartRepository.getCart(2));
        // orderService.add(4);
        //orderService.update(2);
        //orderService.remove(2);
    }
}
