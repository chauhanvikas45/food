package com.qualteco.food.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qualteco.food.exception.Merchant405Exception;

public interface MerchantApi {
	@RequestMapping(method = RequestMethod.GET, path = "/add", produces = "application/json")
    public default ResponseEntity addMerchant() throws Merchant405Exception {
        throw new Merchant405Exception("method not implemented");
    }

}
