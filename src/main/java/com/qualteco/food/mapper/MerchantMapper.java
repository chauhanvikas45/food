package com.qualteco.food.mapper;

import com.qualteco.food.dto.MerchantDto;
import com.qualteco.food.model.Merchant;

public class MerchantMapper {

    public static Merchant mapDtoToEntity(MerchantDto merchantDto){
        Merchant merchant = new Merchant();
        merchant.setMerchantName(merchantDto.getMerchantName());
        merchant.setMerchant_addresses(merchantDto.getMerchant_addresses());
        merchant.setMerchant_phones(merchantDto.getMerchant_phones());
        //merchant.setEmployee(merchantDto.getEmployee());
        return merchant;
    }


    public static MerchantDto mapEntityToDto(Merchant merchant){
        MerchantDto merchantDto = new MerchantDto();


        return merchantDto;
    }
}
