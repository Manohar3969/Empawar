package com.manohar3969.empawar.controller;

import com.manohar3969.empawar.model.Product;
import com.manohar3969.empawar.service.ImageUploadService;
import com.manohar3969.empawar.service.ProductService;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
@Validated
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private ImageUploadService imageUploadService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String createProduct(@RequestPart("product") Product product, @RequestPart("file") MultipartFile file) {
        try {
//            product.setProductImage(imageUploadService.uploadImage(file));
            productService.createProduct(product);
            return "Product Added Successfully";
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to Add Product! + " + e.getMessage();
        }
    }

    @GetMapping("/id/{productId}")
    public Optional<Product> getProduct(@PathVariable @NotNull @Min(1) String productId) {
        return productService.findProductById(productId);
    }

    @GetMapping("/category/{productCategory}")
    public List<Product> getProductByCategory(@PathVariable @NotNull @Size(min = 2) String productCategory) {
        return productService.findProductByCategory(productCategory);
    }

    @GetMapping("/{productName}")
    public List<Product> getProductByName(@PathVariable @NotNull @Size(min = 2) String productName) {
        return productService.findProductByNameContaining(productName);
    }
}
