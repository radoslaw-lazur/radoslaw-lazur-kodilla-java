package com.kodilla.good.patterns.challenges.first.services;

import com.kodilla.good.patterns.challenges.first.models.User;

public class SmsService implements InformationService {

    @Override
    public void inform(User user) {
        String MESSAGE = "The order has been created! Thank You";
        System.out.println("Messege to: " + user.getFirstName() + " " + user.getLastName() + " via SMS: "
                + user.getPhoneNumber() + ": " + MESSAGE);
        System.out.println("**************************************");
    }
}
