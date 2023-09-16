package session15.practice.travelBooking;

import java.util.List;

public class Flight {

    private String origin;
    private String destination;
    private double price;
    private String airlineName;
    private String flightId;

    public Flight(String origin, String destination, double price, String airlineName, String flightId) {
        this.origin = origin;
        this.destination = destination;
        this.price = price;
        this.airlineName = airlineName;
        this.flightId = flightId;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public void addFlightToList(Flight flight, List<Flight> flights) {
        flights.add(flight);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", price=" + price +
                ", airlineName='" + airlineName + '\'' +
                ", flightId='" + flightId + '\'' +
                '}';
    }
}
