package com.kodilla.good.patterns.challenges.second;

import com.kodilla.good.patterns.challenges.second.processors.orders.ExtraFoodShopOrder;

import com.kodilla.good.patterns.challenges.second.processors.orders.GlutenFreeShopOrder;
import com.kodilla.good.patterns.challenges.second.processors.orders.HealthyShopOrder;
import com.kodilla.good.patterns.challenges.second.processors.orders.ShopRecognizer;

public class Application {

    public static void main(String[] args) {

        ShopRecognizer shopRecognizer = new ShopRecognizer();
        shopRecognizer.recognize(new GlutenFreeShopOrder());
        System.out.println();
        shopRecognizer.recognize(new HealthyShopOrder());
        System.out.println();
        shopRecognizer.recognize(new ExtraFoodShopOrder());


    }
}
