package com.manohar3969.empawar.controller;

import com.manohar3969.empawar.model.Category;
import com.manohar3969.empawar.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @PostMapping
    public Category createProduct(@RequestBody Category category) {
        return categoryService.createProduct(category);
    }

    @GetMapping("/{categoryId}")
    public Optional<Category> getCategoryById(@PathVariable String categoryId) {
        return categoryService.getCategoryById(categoryId);
    }
}
