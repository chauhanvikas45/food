package com.qualteco.food.service;

import com.qualteco.food.dto.MerchantDto;
import com.qualteco.food.exception.Merchant405Exception;

public interface MerchantService {
    MerchantDto addMerchant(MerchantDto merchantDto) throws Merchant405Exception;
}
