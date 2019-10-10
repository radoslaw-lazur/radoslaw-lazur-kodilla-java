package com.kodilla.good.patterns.challenges.second.processors.shops;

import com.kodilla.good.patterns.challenges.second.models.Request;
import com.kodilla.good.patterns.challenges.second.services.informations.InformationService;
import com.kodilla.good.patterns.challenges.second.services.orderservices.OrderService;
import com.kodilla.good.patterns.challenges.second.services.rapositories.Rapository;

public class GlutenFreeShopProcessor {

    private InformationService informationService;
    private Rapository rapository;
    private OrderService orderService;

    public GlutenFreeShopProcessor(final InformationService informationService, final Rapository rapository,
                                   final OrderService orderService) {
        this.informationService = informationService;
        this.rapository = rapository;
        this.orderService = orderService;
    }

    public void process(final Request request) {
        boolean isOrdered = orderService.makeOrder(request.getUser(), request.getShop(), request.getProductSet());
        if (isOrdered) {
            informationService.inform(request.getShop(), request.getUser(), request.getProductSet());
            rapository.save(request);
        }
    }
}
