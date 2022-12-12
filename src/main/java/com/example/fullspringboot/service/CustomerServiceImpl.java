package com.example.fullspringboot.service;

import com.example.fullspringboot.exception.CustomerNotFoundException;
import com.example.fullspringboot.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(Long id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
       if(customerOptional.isPresent())
           return new Customer(
                        customerOptional.get().id,
                        customerOptional.get().name,
                        customerOptional.get().email,
                        customerOptional.get().age);
       else throw new CustomerNotFoundException("Пользователь не найден {} id = " + id);
    }

    @Override
    public void addNewCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
    }
}
