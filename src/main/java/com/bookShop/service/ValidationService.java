package com.bookShop.service;

import com.bookShop.model.Customer;

public class ValidationService {

    public boolean validatePhoneNumber(Customer customer) {
        //validate phone numbers of format "1234567890"
        if (customer.getPhone().matches("\\d{10}"))
            return true;
        else return false;
    }
}
