package model;

import java.math.BigInteger;

/**
 * Объект билета
 */
public class Ticket {
    private String origin;
    private String origin_name;
    private String destination;
    private String destination_name;
    private String departure_date;
    private String departure_time;
    private String arrival_date;
    private String arrival_time;
    private String carrier;
    private String stops;
    private BigInteger price;

    public Ticket() {
    }

    public Ticket(String origin
            , String origin_name
            , String destination
            , String destination_name
            , String departure_date
            , String departure_time
            , String arrival_date
            , String arrival_time
            , String carrier
            , String stops
            , BigInteger price) {
        this.origin = origin;
        this.origin_name = origin_name;
        this.destination = destination;
        this.destination_name = destination_name;
        this.departure_date = departure_date;
        this.departure_time = departure_time;
        this.arrival_date = arrival_date;
        this.arrival_time = arrival_time;
        this.carrier = carrier;
        this.stops = stops;
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin_name() {
        return origin_name;
    }

    public void setOrigin_name(String origin_name) {
        this.origin_name = origin_name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination_name() {
        return destination_name;
    }

    public void setDestination_name(String destination_name) {
        this.destination_name = destination_name;
    }

    public String getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(String departure_date) {
        this.departure_date = departure_date;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public String getArrival_date() {
        return arrival_date;
    }

    public void setArrival_date(String arrival_date) {
        this.arrival_date = arrival_date;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getStops() {
        return stops;
    }

    public void setStops(String stops) {
        this.stops = stops;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (origin != null ? !origin.equals(ticket.origin) : ticket.origin != null) return false;
        if (origin_name != null ? !origin_name.equals(ticket.origin_name) : ticket.origin_name != null) return false;
        if (destination != null ? !destination.equals(ticket.destination) : ticket.destination != null) return false;
        if (destination_name != null ? !destination_name.equals(ticket.destination_name) : ticket
                .destination_name != null)
            return false;
        if (departure_date != null ? !departure_date.equals(ticket.departure_date) : ticket.departure_date != null)
            return false;
        if (departure_time != null ? !departure_time.equals(ticket.departure_time) : ticket.departure_time != null)
            return false;
        if (arrival_date != null ? !arrival_date.equals(ticket.arrival_date) : ticket.arrival_date != null)
            return false;
        if (arrival_time != null ? !arrival_time.equals(ticket.arrival_time) : ticket.arrival_time != null)
            return false;
        if (carrier != null ? !carrier.equals(ticket.carrier) : ticket.carrier != null) return false;
        if (stops != null ? !stops.equals(ticket.stops) : ticket.stops != null) return false;
        return price != null ? price.equals(ticket.price) : ticket.price == null;
    }

    @Override
    public int hashCode() {
        int result = origin != null ? origin.hashCode() : 0;
        result = 31 * result + (origin_name != null ? origin_name.hashCode() : 0);
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        result = 31 * result + (destination_name != null ? destination_name.hashCode() : 0);
        result = 31 * result + (departure_date != null ? departure_date.hashCode() : 0);
        result = 31 * result + (departure_time != null ? departure_time.hashCode() : 0);
        result = 31 * result + (arrival_date != null ? arrival_date.hashCode() : 0);
        result = 31 * result + (arrival_time != null ? arrival_time.hashCode() : 0);
        result = 31 * result + (carrier != null ? carrier.hashCode() : 0);
        result = 31 * result + (stops != null ? stops.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "origin='" + origin + '\'' +
                ", origin_name='" + origin_name + '\'' +
                ", destination='" + destination + '\'' +
                ", destination_name='" + destination_name + '\'' +
                ", departure_date='" + departure_date + '\'' +
                ", departure_time='" + departure_time + '\'' +
                ", arrival_date='" + arrival_date + '\'' +
                ", arrival_time='" + arrival_time + '\'' +
                ", carrier='" + carrier + '\'' +
                ", stops='" + stops + '\'' +
                ", price=" + price +
                '}';
    }
}
