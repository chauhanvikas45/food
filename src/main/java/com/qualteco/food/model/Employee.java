package com.qualteco.food.model;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String employeeName;
    private String employeeNumber;

    private boolean deletionFlag;

    //@OneToOne(mappedBy = "employee")
    //private Employee_Opt_Out_Table employee_opt_out_table;

    @OneToOne
    @MapsId
    private Merchant merchant;
/*
    //@OneToOne(mappedBy = "employee")
    private Employee_Order_Details employee_order_details;


    public Employee() {
    }

    public Employee_Order_Details getEmployee_order_details() {
        return employee_order_details;
    }

    public void setEmployee_order_details(Employee_Order_Details employee_order_details) {
        this.employee_order_details = employee_order_details;
    }

    public Employee_Opt_Out_Table getEmployee_opt_out_table() {
        return employee_opt_out_table;
    }

    public void setEmployee_opt_out_table(Employee_Opt_Out_Table employee_opt_out_table) {
        this.employee_opt_out_table = employee_opt_out_table;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public boolean isDeletionFlag() {
        return deletionFlag;
    }

    public void setDeletionFlag(boolean deletionFlag) {
        this.deletionFlag = deletionFlag;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }
}
