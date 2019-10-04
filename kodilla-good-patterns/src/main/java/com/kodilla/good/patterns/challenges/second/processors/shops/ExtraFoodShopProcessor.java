package com.kodilla.good.patterns.challenges.second.processors.shops;

import com.kodilla.good.patterns.challenges.second.models.Request;
import com.kodilla.good.patterns.challenges.second.models.SaleDto;
import com.kodilla.good.patterns.challenges.second.services.informations.InformationService;
import com.kodilla.good.patterns.challenges.second.services.orderservices.GiftService;
import com.kodilla.good.patterns.challenges.second.services.orderservices.OrderService;
import com.kodilla.good.patterns.challenges.second.services.rapositories.Rapository;

public class ExtraFoodShopProcessor {

    private InformationService informationService;
    private Rapository rapository;
    private OrderService orderService;
    private GiftService giftService;

    public ExtraFoodShopProcessor(final InformationService informationService, final Rapository rapository,
                                  final OrderService orderService, final GiftService giftService) {
        this.informationService = informationService;
        this.rapository = rapository;
        this.orderService = orderService;
        this.giftService = giftService;

    }

    public SaleDto process(final Request request) {
        boolean isOrdered = orderService.makeOrder(request.getUser(), request.getShop(), request.getProductSet());
        if (isOrdered) {
            informationService.inform(request.getShop(), request.getUser(), request.getProductSet());
            giftService.makeGiftOrder();
            rapository.save(request);
            return new SaleDto(true);
        } else {
            return new SaleDto(false);
        }
    }
}
