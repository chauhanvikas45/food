package com.qualteco.food.controller;

import com.qualteco.food.exception.Merchant404Exception;
import com.qualteco.food.request.AddMerchantRequest;
import com.qualteco.food.response.AddMerchantResponse;
import com.qualteco.food.service.MerchantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = RequestMethod.GET, path = "/{id}", produces = "application/json")
    public ResponseEntity addMerchant(@PathVariable("id") Integer id) throws Merchant404Exception {
        AddMerchantResponse addMerchantResponse = merchantService.getMerchantById(id);
        return new ResponseEntity(addMerchantResponse, HttpStatus.OK);
    }
}
