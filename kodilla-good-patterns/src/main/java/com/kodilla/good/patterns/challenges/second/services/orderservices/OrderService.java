package com.kodilla.good.patterns.challenges.second.services.orderservices;

import com.kodilla.good.patterns.challenges.second.models.Product;
import com.kodilla.good.patterns.challenges.second.models.Shop;
import com.kodilla.good.patterns.challenges.second.models.User;

import java.util.Set;

public class OrderService {

    public boolean makeOrder(User user, Shop shop, Set<Product> productSet) {
        System.out.println("Order in progress...");
        System.out.println("Order data for " + user.getLogin() + " from " + shop.getShopName() + " is:");
        productSet.forEach(System.out::println);
        System.out.println("**************************************");
        return true;
    }
}
