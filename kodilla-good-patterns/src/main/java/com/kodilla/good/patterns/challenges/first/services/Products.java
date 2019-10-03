package com.kodilla.good.patterns.challenges.first.services;

import com.kodilla.good.patterns.challenges.first.models.Product;

public class Products {

    private Product product = new Product("Shampoo Nivea", "Cosmetics", true);

    public Product getProduct() {
        return product;
    }
}
