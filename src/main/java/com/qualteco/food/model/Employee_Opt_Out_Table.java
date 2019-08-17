package com.qualteco.food.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

//@Entity
public class Employee_Opt_Out_Table {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    //TODO mapping
    private Employee employeeId;
    private Date optOutFrom;
    private Date OptOutTo;


    public Employee_Opt_Out_Table() {
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

    public Date getOptOutFrom() {
        return optOutFrom;
    }

    public void setOptOutFrom(Date optOutFrom) {
        this.optOutFrom = optOutFrom;
    }

    public Date getOptOutTo() {
        return OptOutTo;
    }

    public void setOptOutTo(Date optOutTo) {
        OptOutTo = optOutTo;
    }


}
