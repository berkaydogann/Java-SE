package com.example.jpa.service;

import com.example.jpa.entities.Customer;
import com.example.jpa.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    final CustomerRepository customerRepository;

    public Customer save(Customer customer) {
        customer.setStatus(true);
        try {
            return customerRepository.save(customer);
        } catch (Exception ex) {
            return null;
        }
    }
}
