package com.example.jpa.service;

import com.example.jpa.entities.Product;
import com.example.jpa.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    final ProductRepository productRepository;

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public List<Product> allProduct(Product product) {
        return productRepository.findAll();
    }


}
