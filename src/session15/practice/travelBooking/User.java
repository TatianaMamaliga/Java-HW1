package session15.practice.travelBooking;

import java.util.List;

public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printFlights(List<Flight> flightList) {
        for (Flight flight : flightList) {
            System.out.println(flight.toString());
        }
    }

    public Flight getBestFlight(List<Flight> flightList) {
        double bestPrice = Double.MAX_VALUE;


        Flight bestFlight = null;

        for (Flight flight : flightList) {
            if (flight.getPrice() < bestPrice) {
                bestPrice = flight.getPrice();
                bestFlight = flight;
            }
        }
        return bestFlight;
    }
}
