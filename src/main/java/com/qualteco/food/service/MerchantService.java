package com.qualteco.food.service;

import com.qualteco.food.exception.Merchant405Exception;
import com.qualteco.food.request.AddMerchantRequest;
import com.qualteco.food.response.AddMerchantResponse;

public interface MerchantService {
    AddMerchantResponse addMerchant(AddMerchantRequest addMerchantRequest);
}
