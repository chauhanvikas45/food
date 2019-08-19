package com.qualteco.food.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Merchant/* extends Base*/{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @CreationTimestamp
    private Date creationTime;
    @UpdateTimestamp
    private Date lastUpdationTime;

    private String merchantName;

    private boolean deletionFlag;

    @OneToOne(mappedBy = "merchant")
    //@JoinColumn(name = "address_id", referencedColumnName = "id")
    private Merchant_Address merchant_addresses;

    @OneToOne(mappedBy = "merchant")
    private Merchant_Phone merchant_phones;


    @OneToOne(mappedBy = "merchant")
    private Merchant_Food_Mapping merchant_food_mapping;

    @OneToOne(mappedBy = "merchant")
    private Employee employee;





    public Merchant() {
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Merchant_Phone getMerchant_phones() {
        return merchant_phones;
    }

    public void setMerchant_phones(Merchant_Phone merchant_phones) {
        this.merchant_phones = merchant_phones;
    }

    public Merchant_Food_Mapping getMerchant_food_mapping() {
        return merchant_food_mapping;
    }

    public void setMerchant_food_mapping(Merchant_Food_Mapping merchant_food_mapping) {
        this.merchant_food_mapping = merchant_food_mapping;
    }

    public Merchant_Address getMerchant_addresses() {
        return merchant_addresses;
    }

    public void setMerchant_addresses(Merchant_Address merchant_addresses) {
        this.merchant_addresses = merchant_addresses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getLastUpdationTime() {
        return lastUpdationTime;
    }

    public void setLastUpdationTime(Date lastUpdationTime) {
        this.lastUpdationTime = lastUpdationTime;
    }

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
}
