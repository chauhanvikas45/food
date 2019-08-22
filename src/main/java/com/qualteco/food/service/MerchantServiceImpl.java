package com.qualteco.food.service;

import com.qualteco.food.dao.MerchantDao;
import com.qualteco.food.dto.MerchantDto;
import com.qualteco.food.exception.Merchant405Exception;
import com.qualteco.food.mapper.MerchantMapper;
import com.qualteco.food.model.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    MerchantDao merchantDao;

    @Override
    public MerchantDto addMerchant(MerchantDto merchantDto) throws Merchant405Exception {
        Merchant merchant = null;
        Merchant merchantResponse= null;
        if(null == merchantDto)
            throw new Merchant405Exception("Invalid data body");
        else{
            merchant = MerchantMapper.mapDtoToEntity(merchantDto);
            merchantResponse = merchantDao.save(merchant);
        }

        return MerchantMapper.mapEntityToDto(merchantResponse);
    }
}
