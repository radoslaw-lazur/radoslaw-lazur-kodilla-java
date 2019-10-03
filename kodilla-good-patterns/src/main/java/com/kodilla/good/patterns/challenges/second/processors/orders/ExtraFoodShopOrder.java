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

    @Override
    public void order() {

        InformationService informationServiceExtraFoodShop = new EmailService();
        Rapository rapository = new Rapository();
        OrderService orderService = new OrderService();
        GiftService giftService = new GiftService();
        Users users = new Users();
        Shops shops = new Shops();


        ExtraFoodShopProducts extraFoodShopProducts = new ExtraFoodShopProducts();
        ExtraFoodShopProcessor extraFoodShopProcessor = new ExtraFoodShopProcessor(informationServiceExtraFoodShop,
                rapository, orderService, giftService);
        Request requestExtraShop = new Request(shops.getExtraFoodShop(), users.getUser1(),
                extraFoodShopProducts.getExtraFoodShopProductsSet());
        extraFoodShopProcessor.process(requestExtraShop);
    }
}
