package com.udemy.springmvcrestdemo.repositories;

import com.udemy.springmvcrestdemo.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);
}
