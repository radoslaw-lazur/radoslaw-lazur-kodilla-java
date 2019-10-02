package com.kodilla.good.patterns.challenges.first.services;

import com.kodilla.good.patterns.challenges.first.models.SaleRequest;
import com.kodilla.good.patterns.challenges.first.models.User;

public class ProductOrderService {

    public boolean makeOrder(User user, SaleRequest saleRequest) {
        System.out.println("Order in progress...");
        System.out.println("**************************************");
        return true;
    }

}
