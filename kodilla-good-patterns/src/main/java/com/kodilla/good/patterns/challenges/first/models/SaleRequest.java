package com.kodilla.good.patterns.challenges.first.models;

public class SaleRequest {

    private User user;
    private Product product;

    public SaleRequest(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "SaleRequest{" +
                "user=" + user +
                ", product=" + product +
                '}';
    }
}
