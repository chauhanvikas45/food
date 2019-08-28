package com.qualteco.food.service;

import com.qualteco.food.dao.FoodDao;
import com.qualteco.food.exception.Food400Exception;
import com.qualteco.food.mapper.FoodMapper;
import com.qualteco.food.model.Food_Menu;
import com.qualteco.food.request.AddFoodRequest;
import com.qualteco.food.response.AddFoodResponse;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FoodServiceImpl implements FoodService {

    private FoodDao foodDao;

    public FoodServiceImpl(FoodDao foodDao) {
        this.foodDao = foodDao;
    }

    @Override
    public AddFoodResponse addFood(AddFoodRequest addFoodRequest) {
        Optional.ofNullable(addFoodRequest).orElseThrow(() -> new Food400Exception("invalid food body"));
            Food_Menu  food_menu = foodDao.save(FoodMapper.mapRequestToEntity(addFoodRequest));
        return FoodMapper.mapEntityToResponse(food_menu);
    }
}
