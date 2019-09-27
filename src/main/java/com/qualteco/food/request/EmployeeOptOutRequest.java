package com.qualteco.food.request;

import com.qualteco.food.model.Employee;

import java.sql.Date;

public class EmployeeOptOutRequest {
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
}
