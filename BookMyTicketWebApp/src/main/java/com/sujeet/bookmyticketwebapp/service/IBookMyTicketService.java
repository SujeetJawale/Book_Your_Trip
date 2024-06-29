package com.sujeet.bookmyticketwebapp.service;

import com.sujeet.bookmyticketwebapp.reqres.Passenger;
import com.sujeet.bookmyticketwebapp.reqres.Ticket;
import org.springframework.stereotype.Service;

public interface IBookMyTicketService {
    public Ticket bookTicket(Passenger passenger);

    public Ticket getFullTicket(Integer ticketNumber);
}
