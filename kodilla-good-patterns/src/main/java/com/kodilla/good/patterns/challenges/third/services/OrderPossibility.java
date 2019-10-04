package com.kodilla.good.patterns.challenges.third.services;

import com.kodilla.good.patterns.challenges.third.models.Flight;
import com.kodilla.good.patterns.challenges.third.processors.FlightProcessor;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.List;

public class OrderPossibility {

    private FlightOrderService flightOrderService = new FlightOrderService();
    private Information information = new Information();
    private Flights flights = new Flights();
    private FlightProcessor flightProcessor = new FlightProcessor(flightOrderService, information, flights);

    public void checkFrom(String departureAirport) {
        List<Flight> from = flightProcessor.processFrom(departureAirport);
        from.forEach(System.out::println);
        System.out.println("**************************************************************");
    }

    public void checkTo(String arrivalAirport) {
        List<Flight> to = flightProcessor.processTo(arrivalAirport);
        to.forEach(System.out::println);
        System.out.println("**************************************************************");
    }

    public void checkVia(String departureAirport, String viaFrom, String arrivalAirport) {
        List<Flight> via = flightProcessor.processVia(departureAirport, viaFrom, arrivalAirport);
        via.forEach(System.out::println);
        System.out.println("**************************************************************");
    }

}
