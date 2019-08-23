package com.qualteco.food.model;

import java.sql.Date;
import java.time.LocalDateTime;
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
public class Merchant{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @CreationTimestamp
    private LocalDateTime creationTime;
    @UpdateTimestamp
    private LocalDateTime lastUpdationTime;

    private String merchantName;
    private String email;

    private boolean deletionFlag;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "MERCHANT_ID")
    private Set<Merchant_Address> merchant_addresses;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "MERCHANT_ID")
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
    
    
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "merchant",cascade = CascadeType.ALL)
    private Set<Employee> employee;





    public Merchant() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public LocalDateTime getLastUpdationTime() {
        return lastUpdationTime;
    }

    public void setLastUpdationTime(LocalDateTime lastUpdationTime) {
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
