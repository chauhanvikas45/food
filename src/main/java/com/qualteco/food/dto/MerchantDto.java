package com.qualteco.food.dto;

import com.qualteco.food.model.Employee;
import com.qualteco.food.model.Food_Menu;
import com.qualteco.food.model.Merchant_Address;
import com.qualteco.food.model.Merchant_Phone;

import java.util.Set;

public class MerchantDto {
    private String merchantName;
    private boolean deletionFlag;
    private Set<Merchant_Address> merchant_addresses;
    private Set<Merchant_Phone> merchant_phones;
    private Set<Food_Menu> foodMenuList;
    private Set<Employee> employee;

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public boolean isDeletionFlag() {
        return deletionFlag;
    }

    public void setDeletionFlag(boolean deletionFlag) {
        this.deletionFlag = deletionFlag;
    }

    public Set<Merchant_Address> getMerchant_addresses() {
        return merchant_addresses;
    }

    public void setMerchant_addresses(Set<Merchant_Address> merchant_addresses) {
        this.merchant_addresses = merchant_addresses;
    }

    public Set<Merchant_Phone> getMerchant_phones() {
        return merchant_phones;
    }

    public void setMerchant_phones(Set<Merchant_Phone> merchant_phones) {
        this.merchant_phones = merchant_phones;
    }

    public Set<Food_Menu> getFoodMenuList() {
        return foodMenuList;
    }

    public void setFoodMenuList(Set<Food_Menu> foodMenuList) {
        this.foodMenuList = foodMenuList;
    }

    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }
}
