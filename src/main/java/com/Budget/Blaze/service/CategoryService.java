package com.Budget.Blaze.service;

import com.Budget.Blaze.entity.Category;

public interface CategoryService {
    Category findCategoryByName(String name);
    Category findCategoryById(int id);
}
