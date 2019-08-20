package com.qualteco.food.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Employee_Order_Details {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;
    private Date orderDate;
    //TODO mapping


    @ManyToOne
    @JoinColumn(name = "FOOD_MENU_ID")
    private Food_Menu food_menu;

    

    //TODO mapping
    @ManyToOne
    @JoinColumn(name = "ALA_CARTE_MENU_ID")
    private Ala_carte_Menu ala_carte_menu;


    public Employee_Order_Details() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

   public Food_Menu getFood_menu() {
        return food_menu;
    }

    public void setFood_menu(Food_Menu food_menu) {
        this.food_menu = food_menu;
    }

    public Ala_carte_Menu getAla_carte_menu() {
        return ala_carte_menu;
    }

    public void setAla_carte_menu(Ala_carte_Menu ala_carte_menu) {
        this.ala_carte_menu = ala_carte_menu;
    }
}
