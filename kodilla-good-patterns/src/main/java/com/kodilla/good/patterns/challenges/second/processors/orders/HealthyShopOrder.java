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

    private InformationService informationServiceHealthyShopSms = new SmsService();
    private InformationService informationServiceHealthyShopEmail = new EmailService();
    private Rapository rapository = new Rapository();
    private OrderService orderService = new OrderService();
    private Users users = new Users();
    private Shops shops = new Shops();


    @Override
    public void order() {

        HealthyShopProducts healthyShopProducts = new HealthyShopProducts();
        HealthyShopProcessor healthyShopProcessor = new HealthyShopProcessor(informationServiceHealthyShopSms,
                informationServiceHealthyShopEmail,
                rapository, orderService);
        Request requestHealthyShop = new Request(shops.getHealthyShop(), users.getUser(),
                healthyShopProducts.getHealthyShopProductsSet());
        healthyShopProcessor.process(requestHealthyShop);
    }
}
