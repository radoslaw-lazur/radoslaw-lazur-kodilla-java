package com.kodilla.good.patterns.challenges.second.processors.orders;

import com.kodilla.good.patterns.challenges.second.processors.shops.ExtraFoodShopProcessor;
import com.kodilla.good.patterns.challenges.second.processors.shops.GlutenFreeShopProcessor;
import com.kodilla.good.patterns.challenges.second.processors.shops.HealthyShopProcessor;
import com.kodilla.good.patterns.challenges.second.services.informations.EmailService;
import com.kodilla.good.patterns.challenges.second.services.informations.SmsService;
import com.kodilla.good.patterns.challenges.second.services.orderservices.GiftService;
import com.kodilla.good.patterns.challenges.second.services.orderservices.OrderService;
import com.kodilla.good.patterns.challenges.second.services.products.ExtraFoodShopProducts;
import com.kodilla.good.patterns.challenges.second.services.products.GlutenFreeShopProducts;
import com.kodilla.good.patterns.challenges.second.services.products.HealthyShopProducts;
import com.kodilla.good.patterns.challenges.second.services.rapositories.Rapository;
import com.kodilla.good.patterns.challenges.second.services.shops.Shops;
import com.kodilla.good.patterns.challenges.second.services.users.Users;

public class ForwardClassOrder {

    Users getUsers() {
        return new Users();
    }

    Shops getShops() {
        return new Shops();
    }

    ExtraFoodShopProducts getExtraFoodShopProducts() {
        return new ExtraFoodShopProducts();
    }

    ExtraFoodShopProcessor getExtraFoodShopProcessor() {
        return new ExtraFoodShopProcessor(new EmailService(), new Rapository(), new OrderService(), new GiftService());
    }

    GlutenFreeShopProducts getGlutenFreeShopProducts() {
        return new GlutenFreeShopProducts();
    }

    GlutenFreeShopProcessor getGlutenFreeShopProcessor() {
        return new GlutenFreeShopProcessor(new EmailService(), new Rapository(), new OrderService());
    }

    HealthyShopProducts getHealthyShopProducts() {
        return new HealthyShopProducts();
    }

    HealthyShopProcessor getHealthyShopProcessor() {
        return new HealthyShopProcessor(new SmsService(), new EmailService(), new Rapository(), new OrderService());
    }
}
