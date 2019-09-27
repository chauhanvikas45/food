package com.qualteco.food.service;

import com.qualteco.food.exception.Food404Exception;
import com.qualteco.food.request.AddFoodRequest;
import com.qualteco.food.response.AddFoodResponse;

public interface FoodService {
    AddFoodResponse addFood(AddFoodRequest addFoodRequest);

    AddFoodResponse getFoodById(Integer id) throws Food404Exception;
}
