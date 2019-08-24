package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Schiphol", true);
        flights.put("Tegel", true);
        flights.put("Krakow", false);

        if (!flights.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        }
        return flights.get(flight.getArrivalAirport());
    }
}
