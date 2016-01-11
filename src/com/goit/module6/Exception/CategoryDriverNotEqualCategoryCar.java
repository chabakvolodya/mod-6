package com.goit.module6.Exception;

import com.goit.module6.Category;

/**
 * Created by Администратор on 11.01.2016.
 */
public class CategoryDriverNotEqualCategoryCar extends Exception {
    private Category categoryCar;
    private Category categoryDriver;

    public CategoryDriverNotEqualCategoryCar(Category categoryCar, Category categoryDriver) {
        this.categoryCar = categoryCar;
        this.categoryDriver = categoryDriver;
    }

    public Category getCategoryCar() {
        return categoryCar;
    }

    public Category getCategoryDriver() {
        return categoryDriver;
    }
}
