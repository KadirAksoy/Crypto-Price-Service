package com.kadiraksoy.CryptoPriceService.service;


import com.kadiraksoy.CryptoPriceService.dto.AvgPriceDto;
import com.kadiraksoy.CryptoPriceService.dto.AvgPriceDtoConverter;
import com.kadiraksoy.CryptoPriceService.model.AvgPrice;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CryptoService {

    private final RestTemplate restTemplate;
    private final AvgPriceDtoConverter converter;
//    private final String API_URL = "https://api.binance.com/api/v3/avgPrice?symbol=";

    public CryptoService(RestTemplate restTemplate, AvgPriceDtoConverter converter) {
        this.restTemplate = restTemplate;
        this.converter = converter;
    }


    public AvgPriceDto getCrypto(String symbol){
        AvgPrice avgPrice = restTemplate.getForObject("https://api.binance.com/api/v3/avgPrice?symbol="+ symbol +"USDT", AvgPrice.class);
        avgPrice.setSymbol(symbol);
        return converter.convert(avgPrice);

    }
}
