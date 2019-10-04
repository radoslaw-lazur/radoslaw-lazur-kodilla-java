package com.kodilla.good.patterns.challenges.second.models;

import java.util.Set;

public class Request {

    private Shop shop;
    private User user;
    private Set<Product> productSet;

    public Request(Shop shop, User user, Set<Product> productSet) {
        this.shop = shop;
        this.user = user;
        this.productSet = productSet;
    }

    public Shop getShop() {
        return shop;
    }

    public User getUser() {
        return user;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }
}
