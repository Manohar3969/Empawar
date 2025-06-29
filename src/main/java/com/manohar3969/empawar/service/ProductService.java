package com.manohar3969.empawar.service;

import com.manohar3969.empawar.model.Product;
import com.manohar3969.empawar.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> findProductById(String productId) {
        return productRepository.findById(productId);
    }

    public List<Product> findProductByCategory(String productCategory) {
        return productRepository.findByProductCategory(productCategory);
    }
}
