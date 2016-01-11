package com.goit.module6;

/**
 * Created by Администратор on 11.01.2016.
 */
public class Driver {
    private String name;
    private int age;
    private Category category;

    public Driver(String name, int age, Category category) {
        this.name = name;
        this.age = age;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }
}
