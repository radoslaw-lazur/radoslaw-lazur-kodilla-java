package com.kodilla.good.patterns.challenges.second.processors.orders;

import com.kodilla.good.patterns.challenges.second.models.Request;
import com.kodilla.good.patterns.challenges.second.processors.shops.HealthyShopProcessor;
import com.kodilla.good.patterns.challenges.second.services.informations.EmailService;
import com.kodilla.good.patterns.challenges.second.services.informations.InformationService;
import com.kodilla.good.patterns.challenges.second.services.informations.SmsService;
import com.kodilla.good.patterns.challenges.second.services.orderservices.OrderService;
import com.kodilla.good.patterns.challenges.second.services.products.HealthyShopProducts;
import com.kodilla.good.patterns.challenges.second.services.rapositories.Rapository;
import com.kodilla.good.patterns.challenges.second.services.shops.Shops;
import com.kodilla.good.patterns.challenges.second.services.users.Users;

public class HealthyShopOrder implements ShopOrder {

    @Override
    public void order() {

        InformationService informationServiceHealthyShopSms = new SmsService();
        InformationService informationServiceHealthyShopEmail = new EmailService();
        Rapository rapository = new Rapository();
        OrderService orderService = new OrderService();
        Users users = new Users();
        Shops shops = new Shops();

        HealthyShopProducts healthyShopProducts = new HealthyShopProducts();
        HealthyShopProcessor healthyShopProcessor = new HealthyShopProcessor(informationServiceHealthyShopSms,
                informationServiceHealthyShopEmail,
                rapository, orderService);
        Request requestHealthyShop = new Request(shops.getHealthyShop(), users.getUser1(),
                healthyShopProducts.getHealthyShopProductsSet());
        healthyShopProcessor.process(requestHealthyShop);
    }
}
