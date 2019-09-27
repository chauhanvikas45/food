package com.qualteco.food.response;

import com.qualteco.food.constant.Category;
import com.qualteco.food.constant.WeekDays;
import com.qualteco.food.model.Employee_Order_Details;

import java.util.Set;

public class GetFoodResponse extends AddFoodResponse{
    private int id;
    private String itemName;
    private boolean isAvailable;
    private WeekDays day;
    private Category menu_category;
    private Set<Employee_Order_Details> employee_order_details;

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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
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

    public Set<Employee_Order_Details> getEmployee_order_details() {
        return employee_order_details;
    }

    public void setEmployee_order_details(Set<Employee_Order_Details> employee_order_details) {
        this.employee_order_details = employee_order_details;
    }
}
