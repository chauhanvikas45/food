package com.qualteco.food.model;

import javax.persistence.*;

//@Entity
public class Merchant_Food_Mapping {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne()
    @MapsId
    private Merchant merchantId;

    private Food_Menu food_menu_d;

    public Merchant_Food_Mapping() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Merchant getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Merchant merchantId) {
        this.merchantId = merchantId;
    }

    public Food_Menu getFood_menu_d() {
        return food_menu_d;
    }

    public void setFood_menu_d(Food_Menu food_menu_d) {
        this.food_menu_d = food_menu_d;
    }
}
