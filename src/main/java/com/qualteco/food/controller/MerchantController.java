package com.qualteco.food.controller;

import com.qualteco.food.dto.MerchantDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qualteco.food.service.MerchantService;

@RestController
public class MerchantController implements MerchantApi{

    @Autowired
    private MerchantService merchantService;

    public MerchantController(MerchantService merchantService) {
        this.merchantService = merchantService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/add", produces = "application/json")
    public ResponseEntity addMerchant(@RequestBody MerchantDto merchantDto) {
        MerchantDto merchantDtoResponse =merchantService.addMerchant(null);
        return new ResponseEntity(merchantDtoResponse, HttpStatus.CREATED);
    }
}
