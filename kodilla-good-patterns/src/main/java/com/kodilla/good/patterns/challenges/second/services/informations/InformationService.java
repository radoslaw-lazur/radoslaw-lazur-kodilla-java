package com.kodilla.good.patterns.challenges.second.services.informations;

import com.kodilla.good.patterns.challenges.second.models.Product;
import com.kodilla.good.patterns.challenges.second.models.Shop;
import com.kodilla.good.patterns.challenges.second.models.User;

import java.util.Set;

public interface InformationService {

    void inform(Shop Shop, User user, Set<Product> productSet);
}
