package com.qualteco.food.response;

import com.qualteco.food.constant.Category;
import com.qualteco.food.constant.WeekDays;

public class AddFoodResponse {
    private int id;
    private String itemName;
    private WeekDays day;
    private Category menu_category;

    public AddFoodResponse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public WeekDays getDay() {
        return day;
    }

    public void setDay(WeekDays day) {
        this.day = day;
    }

    public Category getMenu_category() {
        return menu_category;
    }

    public void setMenu_category(Category menu_category) {
        this.menu_category = menu_category;
    }
}

