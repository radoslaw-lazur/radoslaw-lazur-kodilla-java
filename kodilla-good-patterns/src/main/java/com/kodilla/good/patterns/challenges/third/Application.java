package com.kodilla.good.patterns.challenges.third;


import com.kodilla.good.patterns.challenges.third.services.OrderPossibility;

public class Application {

    public static void main(String[] args) {
        OrderPossibility orderPossibility = new OrderPossibility();
        orderPossibility.checkFrom("Wroclaw");
        orderPossibility.checkTo("Gdansk");
        orderPossibility.checkVia("Krakow", "Warsaw", "Gdansk");
    }
}
