package com.kodilla.patterns.strategy.makler.customers;

import com.kodilla.patterns.strategy.makler.predictors.ConservativePredictor;

public class IndividualCustomer extends Customer {
    public IndividualCustomer(String name) {
        super(name);
        this.buyPredictor = new ConservativePredictor();
    }
}
