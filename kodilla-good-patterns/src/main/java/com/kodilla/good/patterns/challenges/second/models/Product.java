package com.kodilla.good.patterns.challenges.second.models;

import java.util.Objects;

public class Product {

    private String productName;
    private String productCategory;
    private boolean inStock;

    public Product(String productName, String productCategory, boolean inStock) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.inStock = inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return inStock == product.inStock &&
                Objects.equals(productName, product.productName) &&
                Objects.equals(productCategory, product.productCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productCategory, inStock);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", inStock=" + inStock +
                '}';
    }
}
