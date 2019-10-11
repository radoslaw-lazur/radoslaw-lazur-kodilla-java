package com.kodilla.good.patterns.challenges.second.processors.shops;

import com.kodilla.good.patterns.challenges.second.models.Request;
import com.kodilla.good.patterns.challenges.second.services.informations.InformationService;
import com.kodilla.good.patterns.challenges.second.services.orderservices.OrderService;
import com.kodilla.good.patterns.challenges.second.services.rapositories.Rapository;

public class HealthyShopProcessor {

    private InformationService informationServiceSms;
    private InformationService informationServiceEmail;
    private Rapository rapository;
    private OrderService orderService;

    public HealthyShopProcessor(final InformationService informationServiceSms, final InformationService informationServiceEmail,
                                final Rapository rapository, final OrderService orderService) {
        this.informationServiceSms = informationServiceSms;
        this.informationServiceEmail = informationServiceEmail;
        this.rapository = rapository;
        this.orderService = orderService;
    }

    public void process(final Request request) {
        boolean isOrdered = orderService.makeOrder(request.getUser(), request.getShop(), request.getProductSet());
        if (isOrdered) {
            informationServiceEmail.inform(request.getShop(), request.getUser(), request.getProductSet());
            informationServiceSms.inform(request.getShop(), request.getUser(), request.getProductSet());
            rapository.save(request);
        }
    }
}
