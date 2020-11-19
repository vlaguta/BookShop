package com.bookShop.controller;

import com.bookShop.service.CartService;

import static spark.Spark.port;

public class CartController {

    CartService cartService = new CartService();

    public void start() {
        port(8082);


    }
}
