package com.qualteco.food.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ala_carte_Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String itemName;
    private String description;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "ala_carte_menu")
    private Set<Employee_Order_Details> employee_order_details;

    public Ala_carte_Menu() {
    }

    public Set<Employee_Order_Details> getEmployee_order_details() {
        return employee_order_details;
    }

    public void setEmployee_order_details(Set<Employee_Order_Details> employee_order_details) {
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


