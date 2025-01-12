package com.Budget.Blaze.repository;

import com.Budget.Blaze.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Category findByName(String category);
}
