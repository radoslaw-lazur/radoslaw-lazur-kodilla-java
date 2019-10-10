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

    ForwardClassOrder forward = new ForwardClassOrder();

    @Override
    public void order() {

        Request requestHealthyShop = new Request(forward.getShops().getHealthyShop(), forward.getUsers().getUser(),
                forward.getHealthyShopProducts().getHealthyShopProductsSet());
        forward.getHealthyShopProcessor().process(requestHealthyShop);
    }
}
