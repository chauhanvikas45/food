package com.qualteco.food.constant;

import java.io.Serializable;

public enum Category implements Serializable {
    Breakfast("Breakfast"),
    Lunch("Lunch"),
    Dinner("Dinner");

    private String category;

    Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
