package com.qualteco.food.model;

import javax.persistence.*;

//@Entity
public class Food_Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String itemName;
    private boolean isAvailable;
    //TODO mapping
    //@OneToMany
    private Days daysId;
    //TODO mapping
    @OneToOne(mappedBy = "categoryName_id")
    private Menu_Category menu_categoryId;

    public Food_Menu() {
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Days getDaysId() {
        return daysId;
    }

    public void setDaysId(Days daysId) {
        this.daysId = daysId;
    }

    public Menu_Category getMenu_categoryId() {
        return menu_categoryId;
    }

    public void setMenu_categoryId(Menu_Category menu_categoryId) {
        this.menu_categoryId = menu_categoryId;
    }
}
