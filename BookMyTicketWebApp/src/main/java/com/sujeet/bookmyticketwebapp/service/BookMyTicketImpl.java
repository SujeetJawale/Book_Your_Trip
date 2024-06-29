package com.sujeet.bookmyticketwebapp.service;

import com.sujeet.bookmyticketwebapp.reqres.Passenger;
import com.sujeet.bookmyticketwebapp.reqres.Ticket;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class BookMyTicketImpl implements IBookMyTicketService{
    private final String GET_URL = "http://localhost:8484/bookmyticket/bookticket/fetch/{ticketNumber}";
    private final String BOOKING_URL = "http://localhost:8484/bookmyticket/bookticket/register";

    @Override
    public Ticket bookTicket(Passenger passenger) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Ticket> responseEntity = restTemplate.postForEntity(BOOKING_URL, passenger, Ticket.class);
        return responseEntity.getBody();
    }

    @Override
    public Ticket getFullTicket(Integer ticketNumber) {
        RestTemplate restTemplate=new RestTemplate();
		Ticket ticket = restTemplate.getForObject(GET_URL, Ticket.class, ticketNumber);
		return ticket;
    }
}
