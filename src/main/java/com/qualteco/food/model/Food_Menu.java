package com.qualteco.food.model;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Food_Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String itemName;
    private boolean isAvailable;
    //TODO mapping
    @ManyToOne
    @JoinColumn(name = "DAY_ID")
    private Days day;
    //TODO mapping
    @ManyToOne()
    @JoinColumn(name = "MENU_CATEGORY_ID")
    private Menu_Category menu_category;

    /*@OneToMany(fetch = FetchType.LAZY,mappedBy = "food_menu")
    private Set<Merchant_Food_Mapping> merchant_food_mapping;*/

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "food_menu")
    private Set<Employee_Order_Details> employee_order_details;
    public Food_Menu() {
    }



    public Set<Employee_Order_Details> getEmployee_order_details() {
        return employee_order_details;
    }

    public void setEmployee_order_details(Set<Employee_Order_Details> employee_order_details) {
        this.employee_order_details = employee_order_details;
    }


    public Menu_Category getMenu_category() {
        return menu_category;
    }

    public void setMenu_category(Menu_Category menu_categoryId) {
        this.menu_category = menu_categoryId;
    }

/*    public Set<Merchant_Food_Mapping> getMerchant_food_mapping() {
        return merchant_food_mapping;
    }

    public void setMerchant_food_mapping(Set<Merchant_Food_Mapping> merchant_food_mapping) {
        this.merchant_food_mapping = merchant_food_mapping;
    }*/

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

    public Days getDay() {
        return day;
    }

    public void setDay(Days day) {
        this.day = day;
    }
}
