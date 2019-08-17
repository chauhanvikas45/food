package com.qualteco.food.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

//@Entity
public class Employee_Order_Details {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private Employee employeeId;
    private Date orderDate;
    //TODO mapping
    private Food_Menu food_menuId;
    //TODO mapping
    private Ala_carte_Menu ala_carte_menuId;


    public Employee_Order_Details() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Food_Menu getFood_menuId() {
        return food_menuId;
    }

    public void setFood_menuId(Food_Menu food_menuId) {
        this.food_menuId = food_menuId;
    }

    public Ala_carte_Menu getAla_carte_menuId() {
        return ala_carte_menuId;
    }

    public void setAla_carte_menuId(Ala_carte_Menu ala_carte_menuId) {
        this.ala_carte_menuId = ala_carte_menuId;
    }
}
