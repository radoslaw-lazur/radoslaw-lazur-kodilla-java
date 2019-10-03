package com.kodilla.good.patterns.challenges.first.models;

public class Product {

    private String name;
    private String category;
    private boolean inStock;

    public Product(String name, String category, boolean inStock) {
        this.name = name;
        this.category = category;
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", inStock=" + inStock +
                '}';
    }
}
