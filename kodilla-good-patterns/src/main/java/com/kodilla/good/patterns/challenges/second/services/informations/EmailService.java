package com.kodilla.good.patterns.challenges.second.services.informations;

import com.kodilla.good.patterns.challenges.second.models.Product;
import com.kodilla.good.patterns.challenges.second.models.Shop;
import com.kodilla.good.patterns.challenges.second.models.User;

import java.util.Set;

public class EmailService implements InformationService {

    @Override
    public void inform(Shop shop, User user, Set<Product> productSet) {

        System.out.println("Info sending to: " + user.getEmail() + "  - implementation");
        System.out.println("Info sending to: " + shop.getEmail() + "  - implementation");
        System.out.println("Dear " + user.getFirstName() + " " + user.getLastName());
        String MESSAGE = "The order has been created!";
        productSet.forEach(System.out::println);
        System.out.println(MESSAGE);
        System.out.println(shop.getShopName() +
                " would like to thank " + user.getLogin() + " for the order");
        System.out.println("**************************************");
    }
}
