package com.qualteco.food.service;

import com.qualteco.food.dao.MerchantDao;
import com.qualteco.food.exception.Merchant404Exception;
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

    @Override
    public AddMerchantResponse getMerchantById(Integer id) throws Merchant404Exception {

        try {
            Optional.ofNullable(id).orElseThrow(() -> new Merchant404Exception("Invalid request Body"));
            Optional<Merchant> merchant = merchantDao.findById(id);

            //AddMerchantResponse addMerchantResponse = Optional.ofNullable().orElseThrow(() -> new Merchant404Exception("merchant not found "+id));
            return MerchantMapper.mapEntityToResponse(merchant.get());
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            throw new Merchant404Exception("merchant not found for id "+id);
        }
    }
}
