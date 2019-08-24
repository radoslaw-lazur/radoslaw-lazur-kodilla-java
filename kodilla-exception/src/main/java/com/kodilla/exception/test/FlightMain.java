package com.kodilla.exception.test;

public class FlightMain {
    public static void main(String[] args) {

        Flight flight1 = new Flight("Chopin", "Tegel");
        Flight flight2 = new Flight("Chopin", "Schiphol");
        Flight flight3 = new Flight("Chopin", "Krakow");
        Flight flight4 = new Flight("Chopin", "JFK");
        FlightSearch flightSearch = new FlightSearch();
        try {
            boolean possibleDestination = flightSearch.findFlight(flight3);
            if (possibleDestination){
                System.out.println("There is possible destination!");
            } else {
                System.out.println("There is no possible destination!");
            }
        } catch (RouteNotFoundException e){
            System.out.println("There is no requested destination available...");
        }
    }
}
