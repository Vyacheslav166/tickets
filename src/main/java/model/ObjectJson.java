package model;

import java.util.List;

/**
 * Объект, получаемый из файла JSON
 */
public class ObjectJson {

    private List<Ticket> tickets;

    public ObjectJson() {
    }

    public ObjectJson(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ObjectJson that = (ObjectJson) o;

        return tickets.equals(that.tickets);
    }

    @Override
    public int hashCode() {
        return tickets.hashCode();
    }

    @Override
    public String toString() {
        return "ObjectJson{" +
                "tickets=" + tickets +
                '}';
    }
}
