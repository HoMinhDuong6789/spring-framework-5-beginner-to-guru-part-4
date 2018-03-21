package com.udemy.springmvcrestdemo.services;

import com.udemy.springmvcrestdemo.api.model.CategoryDTO;

import java.util.List;

public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
