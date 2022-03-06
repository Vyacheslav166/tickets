package service;

import model.Ticket;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTicketTest {

    @Test
    public void listFlightTime() {
        Ticket ticket = new Ticket();
        ticket.setOrigin("TestOrigin");
        ticket.setDestination("TestDestination");
        ticket.setDeparture_date("12.05.18");
        ticket.setDeparture_time("6:00");
        ticket.setArrival_date("12.05.18");
        ticket.setArrival_time("7:00");
        List<Ticket> listOfTicket = new ArrayList<>();
        listOfTicket.add(ticket);
        List<Long> differentTimeFlight = new ArrayList<>();
        differentTimeFlight.add(ServiceTicket.differentTimeDate(
                "12.05.18"
                , "6:00"
                , "12.05.18"
                , "7:00"));
        assertEquals(ServiceTicket.listFlightTime(listOfTicket, "TestOrigin", "TestDestination")
                , differentTimeFlight, "Metod listFlightTime is correct");
    }
}
