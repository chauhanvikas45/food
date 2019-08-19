package com.qualteco.food.model;

import javax.persistence.*;

@Entity
public class Merchant_Food_Mapping {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne()
    @MapsId
    private Merchant merchant;

    @OneToOne
    @MapsId
    private Food_Menu food_menu;

    public Merchant_Food_Mapping() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public Food_Menu getFood_menu() {
        return food_menu;
    }

    public void setFood_menu(Food_Menu food_menu) {
        this.food_menu = food_menu;
    }
}
