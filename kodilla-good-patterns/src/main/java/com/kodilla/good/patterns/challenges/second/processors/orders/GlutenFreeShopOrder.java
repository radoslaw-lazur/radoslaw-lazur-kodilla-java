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

    private InformationService informationServiceGlutenFreeShop = new EmailService();
    private Rapository rapository = new Rapository();
    private OrderService orderService = new OrderService();
    private Users users = new Users();
    private Shops shops = new Shops();

    @Override
    public void order() {

        GlutenFreeShopProducts glutenFreeShopProducts = new GlutenFreeShopProducts();
        GlutenFreeShopProcessor glutenFreeShopProcessor = new GlutenFreeShopProcessor(informationServiceGlutenFreeShop,
                rapository, orderService );
        Request requestGlutenFreeShop = new Request(shops.getGlutenFreeShop(), users.getUser(),
                glutenFreeShopProducts.getGlutenFreeShopProductsSet());
        glutenFreeShopProcessor.process(requestGlutenFreeShop);
    }
}
