package com.kodilla.good.patterns.challenges.third.services;

import com.kodilla.good.patterns.challenges.third.models.Flight;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Flights {

    private Set<Flight> flightSet = new HashSet<>();

    private Flight flight1 = new Flight("Krakow", "Warsaw", LocalTime.of(9, 30),
            LocalTime.of(10, 30));
    private Flight flight2 = new Flight("Warsaw", "Gdansk", LocalTime.of(12, 55),
            LocalTime.of(14, 30));
    private Flight flight3 = new Flight("Wroclaw", "Poznan", LocalTime.of(13, 0),
            LocalTime.of(14, 0));
    private Flight flight4 = new Flight("Poznan", "Krakow", LocalTime.of(8, 0),
            LocalTime.of(9, 0));

    public Set<Flight> getFlightSet() {
        flightSet.add(flight1);
        flightSet.add(flight2);
        flightSet.add(flight3);
        flightSet.add(flight4);
        return flightSet;
    }
}
