package com.kodilla.good.patterns.challenges.second.services.products;

import com.kodilla.good.patterns.challenges.second.models.Product;

import java.util.HashSet;
import java.util.Set;

public class HealthyShopProducts {

    private Set<Product> healthyShopProductsSet = new HashSet<>();
    private Product product1 = new Product("Soya Milk Alpro", "Plant Based Diet", true);
    private Product product2 = new Product("Oat Milk Alpro", "Plant Based Diet", true);

    public Set<Product> getHealthyShopProductsSet() {
        healthyShopProductsSet.add(product1);
        healthyShopProductsSet.add(product2);
        return healthyShopProductsSet;
    }
}
