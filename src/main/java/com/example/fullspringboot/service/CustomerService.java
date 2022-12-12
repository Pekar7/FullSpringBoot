package com.example.fullspringboot.service;

import com.example.fullspringboot.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer getCustomerById(Long id);
    void addNewCustomer(Customer customer);
    void deleteCustomerById(Long id);
}
