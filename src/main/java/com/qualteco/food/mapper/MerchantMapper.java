package com.qualteco.food.mapper;

import com.qualteco.food.dto.MerchantDto;
import com.qualteco.food.model.Merchant;
import com.qualteco.food.model.Merchant_Address;

import java.util.Optional;

public class MerchantMapper {

    public static Merchant mapDtoToEntity(MerchantDto merchantDto){
        Merchant merchant = new Merchant();
        merchant.setMerchantName(merchantDto.getMerchantName());
        merchant.setMerchant_addresses(merchantDto.getMerchant_addresses());
        merchant.setMerchant_phones(merchantDto.getMerchant_phones());
        merchant.setEmployee(merchantDto.getEmployee());
        merchant.setFoodMenuList(merchantDto.getFoodMenuList());
        merchant.setEmail(merchantDto.getEmail());

        return merchant;
    }


    public static MerchantDto mapEntityToDto(Optional<Merchant> merchant1){
        MerchantDto merchantDto = new MerchantDto();
        Merchant merchant = merchant1.get();
        merchantDto.setMerchantName(merchant.getMerchantName());
        merchantDto.setMerchant_addresses(merchant.getMerchant_addresses());
        merchantDto.setMerchant_phones(merchant.getMerchant_phones());
        merchantDto.setEmployee(merchant.getEmployee());
        merchantDto.setFoodMenuList(merchant.getFoodMenuList());
        merchantDto.setEmail(merchant.getEmail());
        merchantDto.setId(merchant.getId());
        return merchantDto;
    }
}
