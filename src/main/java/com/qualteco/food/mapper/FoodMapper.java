package com.qualteco.food.mapper;

import com.qualteco.food.constant.Category;
import com.qualteco.food.constant.WeekDays;
import com.qualteco.food.model.Food_Menu;
import com.qualteco.food.request.AddFoodRequest;
import com.qualteco.food.response.AddFoodResponse;

public class FoodMapper {

    public static Food_Menu mapRequestToEntity(AddFoodRequest addFoodRequest){
        Food_Menu  food_menu = new Food_Menu();
        food_menu.setItemName(addFoodRequest.getItemName());
        food_menu.setDay(WeekDays.valueOf(addFoodRequest.getDay().getDay()));
        food_menu.setMenu_category(Category.valueOf(addFoodRequest.getMenu_category().getCategory()));
        return food_menu;
    }

    public static AddFoodResponse mapEntityToResponse(Food_Menu food_menu){
        AddFoodResponse addFoodResponse = new AddFoodResponse();
        addFoodResponse.setItemName(food_menu.getItemName());
        addFoodResponse.setDay(food_menu.getDay());
        addFoodResponse.setId(food_menu.getId());
        addFoodResponse.setMenu_category(food_menu.getMenu_category());
        return addFoodResponse;
    }
}
