package com.qualteco.food.service;

import com.qualteco.food.dao.MerchantDao;
import com.qualteco.food.exception.Merchant405Exception;
import com.qualteco.food.mapper.MerchantMapper;
import com.qualteco.food.model.Merchant;
import com.qualteco.food.request.AddMerchantRequest;
import com.qualteco.food.response.AddMerchantResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    MerchantDao merchantDao;

    @Override
    public AddMerchantResponse addMerchant(AddMerchantRequest addMerchantRequest) {
        Optional.ofNullable(addMerchantRequest).orElseThrow(() -> new Merchant405Exception("Invalid request Body"));
        Merchant merchant = merchantDao.save(MerchantMapper.mapRequestToEntity(addMerchantRequest));
        return MerchantMapper.mapEntityToResponse(merchant);
    }
}
