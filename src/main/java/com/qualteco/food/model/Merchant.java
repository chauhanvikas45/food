package com.qualteco.food.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "merchant")
    //@JoinColumn(name = "address_id", referencedColumnName = "id")
    private Set<Merchant_Address> merchant_addresses;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "merchant")
    private Set<Merchant_Phone> merchant_phones;


    /*@OneToMany(fetch = FetchType.LAZY,mappedBy = "merchant")
    private Set<Merchant_Food_Mapping> merchant_food_mapping;*/
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "MERCHANT_FOOD_MAPPING",
            joinColumns = @JoinColumn(name = "MERCHANT_ID", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name = "FOOD_MENU_ID", referencedColumnName="id")
    )
    private Set<Food_Menu> foodMenuList;
    
    
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "merchant")
    private Set<Employee> employee;





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

	/*public Set<Merchant_Food_Mapping> getMerchant_food_mapping() {
		return merchant_food_mapping;
	}

	public void setMerchant_food_mapping(Set<Merchant_Food_Mapping> merchant_food_mapping) {
		this.merchant_food_mapping = merchant_food_mapping;
	}*/
	
	

	public Set<Employee> getEmployee() {
		return employee;
	}

	public Set<Food_Menu> getFoodMenuList() {
		return foodMenuList;
	}

	public void setFoodMenuList(Set<Food_Menu> foodMenuList) {
		this.foodMenuList = foodMenuList;
	}

	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
    
    
}
