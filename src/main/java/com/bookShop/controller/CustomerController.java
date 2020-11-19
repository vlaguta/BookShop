package com.bookShop.controller;

import com.bookShop.model.Customer;
import com.bookShop.service.CustomerService;
import com.google.gson.Gson;

import static spark.Spark.delete;
import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.put;

public class CustomerController {

    CustomerService customerService = new CustomerService();

    public void start() {
        port(8082);

        post("/customer", (request, response) -> {
            Customer customer = new Gson().fromJson(request.body(), Customer.class);
            customerService.add(customer);
            return "";
        });

        //обновить покупателя
        put("/customers/:id", (request, response) -> {
            Customer customer = new Gson().fromJson(request.body(), Customer.class);
            customerService.update(customer);
            return "";
        });

        //удалить покупателя
        delete("/customers/:id", (request, response) -> {
            Customer customer = new Gson().fromJson(request.body(), Customer.class);
            customerService.remove(customer);
            return "";
        });

    }
}
