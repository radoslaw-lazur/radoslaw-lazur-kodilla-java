package com.kodilla.good.patterns.challenges.second.services.users;

import com.kodilla.good.patterns.challenges.second.models.User;

import java.util.HashSet;
import java.util.Set;

public class Users {

    private User user = new User("Radoslaw", "Lazur", "radoslaw-lazur",
            "777777777", "radoslaw.lazur@gmail.com");

    public User getUser() {
        return user;
    }
}
