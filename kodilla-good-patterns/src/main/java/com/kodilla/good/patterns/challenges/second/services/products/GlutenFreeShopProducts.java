package com.kodilla.good.patterns.challenges.second.services.products;

import com.kodilla.good.patterns.challenges.second.models.Product;

import java.util.HashSet;
import java.util.Set;

public class GlutenFreeShopProducts {

    private Set<Product> glutenFreeShopProductsSet = new HashSet<>();
    private Product product1 = new Product("Oat Whole Grain", "Plant Based Diet", true);
    private Product product2 = new Product("Corn Whole Grain", "Plant Based Diet", true);

    public Set<Product> getGlutenFreeShopProductsSet() {
        glutenFreeShopProductsSet.add(product1);
        glutenFreeShopProductsSet.add(product2);
        return glutenFreeShopProductsSet;
    }
}
