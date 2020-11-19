package com.bookShop.service;

import com.bookShop.dao.CustomerRepository;
import com.bookShop.model.Customer;

public class CustomerService {

    public final ValidationService validationService = new ValidationService();
    private final CustomerRepository customerRepository = new CustomerRepository();
    private final CartService cartService = new CartService();

    public void add(Customer customer) /*throws ValidationException */ {

        //if (!validationService.validatePhoneNumber(customer)) {
        //    throw new ValidationException("Неверный номер телефона");
        //}

        customerRepository.add(customer); //создала юзера
        cartService.add(customer); //для юзера создалась корзина, мб нужно в метод add передавать юзера
    }

    public void update(Customer customer) {
        customerRepository.update(customer);
    }

    public void remove(Customer customer) {
        customerRepository.remove(customer);
      //  cartService.remove();
    }

    public void getCustomer(int customerId){
        customerRepository.getCustomer(customerId);
    }

}
