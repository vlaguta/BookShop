package com.bookShop.service;

import com.bookShop.dao.OrderRepository;

public class OrderService {

    private final OrderRepository orderRepository = new OrderRepository();

    public void add(int customerId) {
        orderRepository.add(customerId);
    }

    public void update(int orderId) {
        orderRepository.update(orderId);
    }

    public void remove(int orderId) {
        orderRepository.remove(orderId);
    }
}
