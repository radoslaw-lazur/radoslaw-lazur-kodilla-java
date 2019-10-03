package com.kodilla.good.patterns.challenges.first.services;

import com.kodilla.good.patterns.challenges.first.models.SaleRequest;

import java.util.ArrayList;
import java.util.List;

public class SaleRapositoryImpl implements SaleRapository {

    @Override
    public void save(SaleRequest saleRequest) {
        List<SaleRequest> saleRequestsList = new ArrayList<>();
        saleRequestsList.add(saleRequest);
        saleRequestsList.forEach(System.out::println);
    }
}
