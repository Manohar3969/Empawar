package com.manohar3969.empawar.service;

import com.manohar3969.empawar.model.Category;
import com.manohar3969.empawar.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category createProduct(Category category) {
        return categoryRepository.save(category);
    }
}
