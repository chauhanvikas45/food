package com.qualteco.food.response;

import com.qualteco.food.model.Employee;
import com.qualteco.food.model.Food_Menu;
import com.qualteco.food.model.Merchant_Address;
import com.qualteco.food.model.Merchant_Phone;

import java.util.Set;

public class AddMerchantResponse {

    private int id;
    private String merchantName;
    private Set<Merchant_Address> merchant_addresses;
    private Set<Merchant_Phone> merchant_phones;
    private Set<Food_Menu> foodMenuList;
    private Set<Employee> employee;
    private String email;

    public AddMerchantResponse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
