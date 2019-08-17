package com.qualteco.food.model;

import com.qualteco.food.constant.Category;

import javax.persistence.*;

//@Entity
public class Menu_Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Enumerated(EnumType.STRING)

    @OneToOne
    @MapsId
    private Category categoryName;

    public Menu_Category() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(Category categoryName) {
        this.categoryName = categoryName;
    }
}
