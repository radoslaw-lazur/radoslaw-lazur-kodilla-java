package com.kodilla.good.patterns.challenges.second.services.orderservices;

import com.kodilla.good.patterns.challenges.second.models.Gift;

public class GiftService {

    public void makeGiftOrder() {
        System.out.println("Additional gift is: " + new Gift("Cotton Bag").getGiftName());
    }
}
