package com.qualteco.food.mapper;

import com.qualteco.food.dto.MerchantDto;
import com.qualteco.food.model.Merchant;
import com.qualteco.food.model.Merchant_Address;
import com.qualteco.food.request.AddMerchantRequest;
import com.qualteco.food.response.AddMerchantResponse;

import java.util.Optional;

public class MerchantMapper {

    public static Merchant mapRequestToEntity(AddMerchantRequest addMerchantRequest){
        Merchant merchant = new Merchant();
        merchant.setMerchantName(addMerchantRequest.getMerchantName());
        merchant.setMerchant_addresses(addMerchantRequest.getMerchant_addresses());
        merchant.setMerchant_phones(addMerchantRequest.getMerchant_phones());
        merchant.setEmployee(addMerchantRequest.getEmployee());
        merchant.setFoodMenuList(addMerchantRequest.getFoodMenuList());
        merchant.setEmail(addMerchantRequest.getEmail());

        return merchant;
    }


    public static AddMerchantResponse mapEntityToResponse(Merchant merchant){
        AddMerchantResponse addMerchantResponse = new AddMerchantResponse();
        //Merchant merchant = merchant.get();
        addMerchantResponse.setMerchantName(merchant.getMerchantName());
        addMerchantResponse.setMerchant_addresses(merchant.getMerchant_addresses());
        addMerchantResponse.setMerchant_phones(merchant.getMerchant_phones());
        addMerchantResponse.setEmployee(merchant.getEmployee());
        addMerchantResponse.setFoodMenuList(merchant.getFoodMenuList());
        addMerchantResponse.setEmail(merchant.getEmail());
        addMerchantResponse.setId(merchant.getId());
        return addMerchantResponse;
    }
}
