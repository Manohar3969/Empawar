package com.manohar3969.empawar.controller;

import com.manohar3969.empawar.model.Product;
import com.manohar3969.empawar.service.ProductService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
@Validated
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody @Valid Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("/id/{productId}")
    public Optional<Product> getProduct(@PathVariable @NotNull @Min(1) String productId) {
        return productService.findProductById(productId);
    }

    @GetMapping("/category/{productCategory}")
    public List<Product> getProductByCategory(@PathVariable @NotNull @Size(min = 2) String productCategory) {
        return productService.findProductByCategory(productCategory);
    }
}
