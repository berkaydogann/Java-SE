package com.example.jpa.service;

import com.example.jpa.entities.Customer;
import com.example.jpa.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    final CustomerRepository customerRepository;

    public Customer login(String email, String password) {
        Optional<Customer> optionalCustomer = customerRepository.findByEmailEqualsIgnoreCaseAndPasswordEquals(email, password);
        if (optionalCustomer.isPresent()) {
            return optionalCustomer.get();
        }
        return null;
    }

    public Customer save(Customer customer) {
        customer.setStatus(true);
        try {
            return customerRepository.save(customer);
        } catch (Exception ex) {
            return null;
        }
    }
}
