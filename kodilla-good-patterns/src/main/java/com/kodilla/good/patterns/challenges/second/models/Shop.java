package com.kodilla.good.patterns.challenges.second.models;

import java.util.Objects;

public class Shop {

    private String shopName;
    private String shopCategory;
    private String email;

    public Shop(String shopName, String shopCategory, String email) {
        this.shopName = shopName;
        this.shopCategory = shopCategory;
        this.email = email;
    }

    public String getShopName() {
        return shopName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(shopName, shop.shopName) &&
                Objects.equals(shopCategory, shop.shopCategory) &&
                Objects.equals(email, shop.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopName, shopCategory, email);
    }
}
