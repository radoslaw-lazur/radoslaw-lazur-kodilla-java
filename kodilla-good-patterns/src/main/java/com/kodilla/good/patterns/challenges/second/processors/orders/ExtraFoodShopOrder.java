package com.kodilla.good.patterns.challenges.second.processors.orders;

import com.kodilla.good.patterns.challenges.second.models.Request;
import com.kodilla.good.patterns.challenges.second.processors.shops.ExtraFoodShopProcessor;
import com.kodilla.good.patterns.challenges.second.services.informations.EmailService;
import com.kodilla.good.patterns.challenges.second.services.informations.InformationService;
import com.kodilla.good.patterns.challenges.second.services.orderservices.GiftService;
import com.kodilla.good.patterns.challenges.second.services.orderservices.OrderService;
import com.kodilla.good.patterns.challenges.second.services.products.ExtraFoodShopProducts;
import com.kodilla.good.patterns.challenges.second.services.rapositories.Rapository;
import com.kodilla.good.patterns.challenges.second.services.shops.Shops;
import com.kodilla.good.patterns.challenges.second.services.users.Users;

public class ExtraFoodShopOrder implements ShopOrder {

    private InformationService informationServiceExtraFoodShop = new EmailService();
    private Rapository rapository = new Rapository();
    private OrderService orderService = new OrderService();
    private GiftService giftService = new GiftService();
    private Users users = new Users();
    private Shops shops = new Shops();
    private ExtraFoodShopProducts extraFoodShopProducts = new ExtraFoodShopProducts();
    private ExtraFoodShopProcessor extraFoodShopProcessor = new ExtraFoodShopProcessor(informationServiceExtraFoodShop,
            rapository, orderService, giftService);

    @Override
    public void order() {
        Request requestExtraShop = new Request(shops.getExtraFoodShop(), users.getUser(),
                extraFoodShopProducts.getExtraFoodShopProductsSet());
        extraFoodShopProcessor.process(requestExtraShop);
    }
}
