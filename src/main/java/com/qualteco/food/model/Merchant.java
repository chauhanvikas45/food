package com.qualteco.food.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Merchant/* extends Base*/{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    //@CreationTimestamp
    private Date creationTime;
    //@UpdateTimestamp
    private Date lastUpdationTime;

    private String merchantName;

    private boolean deletionFlag;

    @OneToOne(mappedBy = "merchantId")
    //@JoinColumn(name = "address_id", referencedColumnName = "id")
    private Merchant_Address merchant_addresses;

    @OneToOne(mappedBy = "merchant_phone_id")
    private Merchant_Phone merchant_phones;

    @OneToOne(mappedBy = "Merchant_Food_Mapping_id")
    private Merchant_Food_Mapping merchant_food_mapping;



    public Merchant() {
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
