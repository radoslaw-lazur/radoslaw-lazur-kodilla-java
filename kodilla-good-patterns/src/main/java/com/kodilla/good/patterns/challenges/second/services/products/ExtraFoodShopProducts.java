package com.kodilla.good.patterns.challenges.second.services.products;

import com.kodilla.good.patterns.challenges.second.models.Product;

import java.util.HashSet;
import java.util.Set;

public class ExtraFoodShopProducts {

    private Set<Product> extraFoodShopProductsSet = new HashSet<>();
    private Product product1 = new Product("Soya Seeds", "Plant Based Diet", true);
    private Product product2 = new Product("Cilantro", "Plant Based Diet", true);

    public Set<Product> getExtraFoodShopProductsSet() {
        extraFoodShopProductsSet.add(product1);
        extraFoodShopProductsSet.add(product2);
        return extraFoodShopProductsSet;
    }
}
