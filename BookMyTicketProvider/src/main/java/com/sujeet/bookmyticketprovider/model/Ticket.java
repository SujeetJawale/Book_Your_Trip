package com.sujeet.bookmyticketprovider.model;

public class Ticket {

    private int ticketNumber;

    private String status;

    private Double cost;

    private String name;

    private String departure;

    private String arrival;

    private String dateOfJourney;

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDateOfJourney() {
        return dateOfJourney;
    }

    public void setDateOfJourney(String dateOfJourney) {
        this.dateOfJourney = dateOfJourney;
    }

    public Ticket(int ticketNumber, String dateOfJourney, String arrival, String departure, String name, Double cost, String status) {
        this.ticketNumber = ticketNumber;
        this.dateOfJourney = dateOfJourney;
        this.arrival = arrival;
        this.departure = departure;
        this.name = name;
        this.cost = cost;
        this.status = status;
    }
    public Ticket() {

    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNumber=" + ticketNumber +
                ", status='" + status + '\'' +
                ", cost=" + cost +
                ", name='" + name + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", dateOfJourney='" + dateOfJourney + '\'' +
                '}';
    }
}
