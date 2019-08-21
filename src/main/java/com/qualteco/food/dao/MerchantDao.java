package com.qualteco.food.dao;

import com.qualteco.food.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantDao extends JpaRepository<Merchant,Integer> {

}
