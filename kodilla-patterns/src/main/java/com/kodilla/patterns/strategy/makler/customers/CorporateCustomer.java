package com.kodilla.patterns.strategy.makler.customers;

import com.kodilla.patterns.strategy.makler.predictors.BalancedPredictor;

public class CorporateCustomer extends Customer {
    public CorporateCustomer(String name) {
        super(name);
        this.buyPredictor = new BalancedPredictor();
    }
}
