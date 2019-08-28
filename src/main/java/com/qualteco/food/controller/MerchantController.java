package com.qualteco.food.controller;

import com.qualteco.food.dto.MerchantDto;
import com.qualteco.food.exception.Merchant405Exception;
import com.qualteco.food.request.AddMerchantRequest;
import com.qualteco.food.response.AddMerchantResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qualteco.food.service.MerchantService;

@RestController
@RequestMapping("/company")
public class MerchantController {

    private MerchantService merchantService;

    public MerchantController(MerchantService merchantService) {
        this.merchantService = merchantService;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/add", produces = "application/json")
    public ResponseEntity addMerchant(@RequestBody AddMerchantRequest addMerchantRequest) {
        AddMerchantResponse addMerchantResponse = merchantService.addMerchant(addMerchantRequest);
        return new ResponseEntity(addMerchantResponse, HttpStatus.CREATED);
    }
}
