package com.kodilla.good.patterns.challenges.second.models;

public class User {

    private String firstName;
    private String lastName;
    private String login;
    private String phoneNumber;
    private String email;

    public User(String firstName, String lastName, String login, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
