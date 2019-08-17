package com.qualteco.food.model;

import javax.persistence.*;

//@Entity
public class Merchant_Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private Integer phoneNumber;
    private String contactType;

    //TODO mapping
    @OneToOne(mappedBy = "merchant_phones")
    @MapsId
    private Merchant merchantId;


    public Merchant_Phone() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public Merchant getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Merchant merchantId) {
        this.merchantId = merchantId;
    }
}
