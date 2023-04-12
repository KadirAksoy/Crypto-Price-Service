package com.kadiraksoy.CryptoPriceService.dto;

import com.kadiraksoy.CryptoPriceService.model.AvgPrice;
import org.springframework.stereotype.Component;


@Component
public class AvgPriceDtoConverter {

    public AvgPriceDto convert(AvgPrice avgPrice){
        return new AvgPriceDto(avgPrice.getMins(),avgPrice.getPrice(), avgPrice.getSymbol());

    }
}
