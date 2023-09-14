package session15.travelBooking;

import java.util.ArrayList;
import java.util.List;

public class FlightBookingSystem {

    public static void main(String[] args) {
        List<Flight> flightList = new ArrayList<>();
        Flight flight1 = new Flight("Bucharest", "New York", 1500, "British Airways", "RE6");
        Flight flight2 = new Flight("Bucharest", "New York", 1700, "Lufthansa", "RE7");
        Flight flight3 = new Flight("Bucharest", "New York", 1800, "Air France", "RE8");


        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);

        User user = new User("Jane");

        System.out.println("All flights: ");
        user.printFlights(flightList);

        System.out.println("Flight with lowest price: ");
        Flight flight = user.getBestFlight(flightList);
        System.out.println(flight);

    }
}
