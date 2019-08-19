package com.qualteco.food.model;

import javax.persistence.*;

@Entity
public class Merchant_Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String address;
    private Integer pincode;
    private String landmark;

    //TODO mapping
    @OneToOne()
    @MapsId
    private Merchant merchant;

    public Merchant_Address() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public Merchant getMerchantId() {
        return merchant;
    }

    public void setMerchantId(Merchant merchantId) {
        this.merchant = merchantId;
    }
}
