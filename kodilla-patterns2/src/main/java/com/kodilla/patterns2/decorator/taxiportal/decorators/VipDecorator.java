package com.kodilla.patterns2.decorator.taxiportal.decorators;

import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;

import java.math.BigDecimal;

public class VipDecorator extends AbstractTaxiOrderDecorator {
    public VipDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription().concat(" + variant VIP");
    }
}
