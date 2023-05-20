package com.example.jpa.controller;

import com.example.jpa.entities.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @GetMapping("/")
    private String register() {
        return "register";
    }

    @PostMapping("/register")
    public String customerRegister(Customer customer) {
        System.out.println(customer);
        return "redirect:/";
    }
}
