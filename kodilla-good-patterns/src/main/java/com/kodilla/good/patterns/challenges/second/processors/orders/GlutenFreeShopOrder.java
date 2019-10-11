package com.kodilla.good.patterns.challenges.second.processors.orders;

import com.kodilla.good.patterns.challenges.second.models.Request;
import com.kodilla.good.patterns.challenges.second.processors.shops.GlutenFreeShopProcessor;
import com.kodilla.good.patterns.challenges.second.services.informations.EmailService;
import com.kodilla.good.patterns.challenges.second.services.informations.InformationService;
import com.kodilla.good.patterns.challenges.second.services.orderservices.OrderService;
import com.kodilla.good.patterns.challenges.second.services.products.GlutenFreeShopProducts;
import com.kodilla.good.patterns.challenges.second.services.rapositories.Rapository;
import com.kodilla.good.patterns.challenges.second.services.shops.Shops;
import com.kodilla.good.patterns.challenges.second.services.users.Users;

public class GlutenFreeShopOrder implements ShopOrder {

    private ForwardClassOrder forward = new ForwardClassOrder();

    @Override
    public void order() {

        Request requestGlutenFreeShop = new Request(forward.getShops().getGlutenFreeShop(), forward.getUsers().getUser(),
                forward.getGlutenFreeShopProducts().getGlutenFreeShopProductsSet());
        forward.getGlutenFreeShopProcessor().process(requestGlutenFreeShop);
    }
}
