package com.kodilla.good.patterns.challenges.second.services.shops;

import com.kodilla.good.patterns.challenges.second.models.Shop;

public class Shops {

    private Shop extraFoodShop = new Shop("Extra Food Shop", "Food Store",
            "extra.food.shop@aa.pl");
    private Shop healthyShop = new Shop("Healthy Shop", "Food Store",
            "healthy.shop@aa.pl");
    private Shop glutenFreeShop = new Shop("Gluten Free Shop", "Food Store",
            "gluten.free.shop@aa.pl");

    public Shop getExtraFoodShop() {
        return extraFoodShop;
    }

    public Shop getHealthyShop() {
        return healthyShop;
    }

    public Shop getGlutenFreeShop() {
        return glutenFreeShop;
    }
}
