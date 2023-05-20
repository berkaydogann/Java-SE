package com.example.jpa.controller;

import com.example.jpa.entities.Customer;
import com.example.jpa.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class RegisterController {
    final CustomerService customerService;

    @GetMapping("/")
    private String register() {
        return "register";
    }

    @PostMapping("/register")
    public String customerRegister(Customer customer) {
        Customer c = customerService.save(customer);
        if (c != null && c.getCid() == null) {

        }
        return "redirect:/";
    }
}
