package com.kodilla.good.patterns.challenges.first.services;

import com.kodilla.good.patterns.challenges.first.models.User;

public class Users {

    private User user = new User("jpmatall", "Fred", "Firestone", "+48777777777");

    public User getUser() {
        return user;
    }
}
