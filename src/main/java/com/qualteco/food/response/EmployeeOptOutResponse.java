package com.qualteco.food.response;

import com.qualteco.food.model.Employee;

import java.sql.Date;

public class EmployeeOptOutResponse {
    private String status;
    private int id;
    private Employee employee;
    private Date optOutFrom;
    private Date OptOutTo;


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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
