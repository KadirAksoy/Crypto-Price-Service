package com.kadiraksoy.CryptoPriceService.controller;


import com.kadiraksoy.CryptoPriceService.dto.AvgPriceDto;
import com.kadiraksoy.CryptoPriceService.service.CryptoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/avgPrice")
public class CryptoController {

    private final CryptoService cryptoService;

    public CryptoController(CryptoService cryptoService) {
        this.cryptoService = cryptoService;
    }

    @GetMapping("/crypto/{symbol}")
    public ResponseEntity<AvgPriceDto> getCrypto(@PathVariable String symbol){
        return ResponseEntity.ok(cryptoService.getCrypto(symbol));

    }
}
