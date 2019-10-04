package com.kodilla.good.patterns.challenges.third.processors;

import com.kodilla.good.patterns.challenges.third.models.Flight;
import com.kodilla.good.patterns.challenges.third.services.FlightOrderService;
import com.kodilla.good.patterns.challenges.third.services.Flights;
import com.kodilla.good.patterns.challenges.third.services.Information;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightProcessor {

    private FlightOrderService flightOrderService;
    private Information information;
    private Flights flights;

    public FlightProcessor(final FlightOrderService flightOrderService, final Information information,
                           final Flights flights) {
        this.flightOrderService = flightOrderService;
        this.information = information;
        this.flights = flights;
    }

    public List<Flight> processFrom(String departureAirport) {
        boolean available = flightOrderService.checkBooking();
        if (available) {
            information.inform();
            return flights.getFlightSet().stream()
                    .filter(t -> t.getDepartureAirport().equals(departureAirport))
                    .collect(Collectors.toList());
        } else {
            return new ArrayList<>();
        }
    }

    public List<Flight> processTo(String arrivalAirport) {
        boolean available = flightOrderService.checkBooking();
        if (available) {
            information.inform();
            return flights.getFlightSet().stream()
                    .filter(t -> t.getArrivalAirport().equals(arrivalAirport))
                    .collect(Collectors.toList());
        } else {
            return new ArrayList<>();
        }
    }

    public List<Flight> processVia(String departureAirport, String via, String arrivalAirport) {
        boolean available = flightOrderService.checkBooking();
        if (available) {
            information.inform();
            return flights.getFlightSet().stream()
                    .filter(t -> t.getDepartureAirport().equals(departureAirport)
                            || t.getArrivalAirport().equals(via)
                            || t.getDepartureAirport().equals(via)
                            || t.getArrivalAirport().equals(arrivalAirport))
                    .collect(Collectors.toList());
        } else  {
            return new ArrayList<>();
        }
    }
}
