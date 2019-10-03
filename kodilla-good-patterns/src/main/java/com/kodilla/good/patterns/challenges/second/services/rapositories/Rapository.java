package com.kodilla.good.patterns.challenges.second.services.rapositories;

import com.kodilla.good.patterns.challenges.first.models.SaleRequest;
import com.kodilla.good.patterns.challenges.second.models.Request;

import java.util.ArrayList;
import java.util.List;

public class Rapository {

    private List<Request> saleRequestsList = new ArrayList<>();

    public void save(Request request) {
        saleRequestsList.add(request);
    }
}
