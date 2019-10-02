package com.kodilla.good.patterns.challenges.first.models;

public class SaleDto {

    private boolean isBought;

    public SaleDto(boolean isBought) {
        this.isBought = isBought;
    }

    public boolean isBought() {
        return isBought;
    }
}
