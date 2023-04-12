package com.kadiraksoy.CryptoPriceService.dto;

import java.math.BigDecimal;

public class AvgPriceDto {
    public AvgPriceDto(String mins, BigDecimal price, String symbol) {
        this.mins = mins;
        this.price = price;
        this.symbol = symbol;
    }
    public AvgPriceDto() {
    }


    private String mins;
    private BigDecimal price;
    private String symbol;



    public void setMins(String mins) {
        this.mins = mins;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }



    public String getMins() {
        return mins;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getSymbol() {
        return symbol;
    }

}
