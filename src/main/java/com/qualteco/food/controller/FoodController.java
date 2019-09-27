package com.qualteco.food.controller;

import com.qualteco.food.exception.Food404Exception;
import com.qualteco.food.request.AddFoodRequest;
import com.qualteco.food.response.AddFoodResponse;
import com.qualteco.food.service.FoodService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/food")
public class FoodController {

    private FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST,consumes = "application/json")
    public ResponseEntity add(@RequestBody AddFoodRequest addFoodRequest){
        AddFoodResponse addFoodResponse =foodService.addFood(addFoodRequest);
        return new ResponseEntity(addFoodResponse,HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET,consumes = "application/json")
    public ResponseEntity add(@PathVariable("id") Integer id) throws Food404Exception {
        AddFoodResponse addFoodResponse =foodService.getFoodById(id);
        return new ResponseEntity(addFoodResponse,HttpStatus.OK);
    }
}
