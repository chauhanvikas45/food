package com.qualteco.food.dao;

import com.qualteco.food.model.Food_Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodDao extends JpaRepository<Food_Menu, Integer> {
}
