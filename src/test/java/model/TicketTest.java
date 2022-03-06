package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketTest {

    @Test
    public void setOrigin() {
        Ticket ticket = new Ticket();
        ticket.setOrigin("TEST");

        assertEquals(ticket.getOrigin(), "TEST", "Origin can not equal 'TEST'");
    }

    @Test
    public void setOrigin_name() {
        Ticket ticket = new Ticket();
        ticket.setOrigin_name("TEST");

        assertEquals(ticket.getOrigin_name(), "TEST", "Origin name can not equal 'TEST'");
    }

    @Test
    public void setDestination() {
        Ticket ticket = new Ticket();
        ticket.setDestination("TEST");

        assertEquals(ticket.getDestination(), "TEST", "Destination can not equal 'TEST'");
    }

    @Test
    public void setDestination_name() {
        Ticket ticket = new Ticket();
        ticket.setDestination_name("TEST");

        assertEquals(ticket.getDestination_name(), "TEST", "Destination name can not equal 'TEST'");
    }


}
