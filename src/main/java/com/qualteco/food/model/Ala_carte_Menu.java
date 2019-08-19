package com.qualteco.food.model;

import javax.persistence.*;

@Entity
public class Ala_carte_Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String itemName;
    private String description;

    @OneToOne(mappedBy = "ala_carte_menu")
    private Employee_Order_Details employee_order_details;

    public Ala_carte_Menu() {
    }

    public Employee_Order_Details getEmployee_order_details() {
        return employee_order_details;
    }

    public void setEmployee_order_details(Employee_Order_Details employee_order_details) {
        this.employee_order_details = employee_order_details;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


