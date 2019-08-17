package com.qualteco.food.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String employeeName;
    private String employeeNumber;

    private boolean deletionFlag;

    private Merchant merchantId;


    public Employee() {
    }

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

    public Merchant getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Merchant merchantId) {
        this.merchantId = merchantId;
    }
}
