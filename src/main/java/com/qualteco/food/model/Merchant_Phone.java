package com.qualteco.food.model;

import javax.persistence.*;

@Entity
public class Merchant_Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private Integer phoneNumber;
    private String contactType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MERCHANT_ID")
    private Merchant merchant;


    public Merchant_Phone() {
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
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

}
