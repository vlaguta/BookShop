package com.bookShop.service;

import com.bookShop.dao.CartRepository;
import com.bookShop.model.Book;
import com.bookShop.model.Cart;
import com.bookShop.model.Customer;

public class CartService {

    private final CartRepository cartRepository = new CartRepository();

    public void add(Customer customer) {
        cartRepository.add(customer);
    }

    public void addBook(int cartId, Book book) {
        cartRepository.addBook(cartId, book);
    }

    public void removeBook(int cartId, Book book) {
        cartRepository.removeBook(cartId, book);
    }

    public void clean(int cartId) {
        cartRepository.clean(cartId);
    }

    public void remove(Cart cart) {
        cartRepository.remove(cart);
    }

}
