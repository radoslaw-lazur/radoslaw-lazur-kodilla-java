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

    @Override
    public void order() {

        InformationService informationServiceGlutenFreeShop = new EmailService();
        Rapository rapository = new Rapository();
        OrderService orderService = new OrderService();
        Users users = new Users();
        Shops shops = new Shops();

        GlutenFreeShopProducts glutenFreeShopProducts = new GlutenFreeShopProducts();
        GlutenFreeShopProcessor glutenFreeShopProcessor = new GlutenFreeShopProcessor(informationServiceGlutenFreeShop,
                rapository, orderService );
        Request requestGlutenFreeShop = new Request(shops.getGlutenFreeShop(), users.getUser1(),
                glutenFreeShopProducts.getGlutenFreeShopProductsSet());
        glutenFreeShopProcessor.process(requestGlutenFreeShop);
    }
}
