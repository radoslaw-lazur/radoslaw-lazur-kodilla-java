package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public boolean findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Schiphol", true);
        flights.put("Tegel", true);
        flights.put("Krakow", false);

        long possibilities = flights.entrySet().stream()
                .filter(entry -> entry.getKey().equals(flight.getArrivalAirport()))
                .filter(entry -> entry.getValue() == true)
                .count();

        if(possibilities > 0){
            return true;
        } else {
            throw new RouteNotFoundException();
        }
    }
}
