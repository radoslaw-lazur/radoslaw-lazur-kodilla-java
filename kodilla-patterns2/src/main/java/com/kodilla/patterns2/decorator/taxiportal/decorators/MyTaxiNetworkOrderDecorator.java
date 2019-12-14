package com.kodilla.patterns2.decorator.taxiportal.decorators;

import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;
import com.kodilla.patterns2.decorator.taxiportal.decorators.AbstractTaxiOrderDecorator;

import java.math.BigDecimal;

public class MyTaxiNetworkOrderDecorator extends AbstractTaxiOrderDecorator {
    public MyTaxiNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(30));
    }

    @Override
    public String getDescription() {
        return super.getDescription().concat(" by MyTaxi Network");
    }
}
