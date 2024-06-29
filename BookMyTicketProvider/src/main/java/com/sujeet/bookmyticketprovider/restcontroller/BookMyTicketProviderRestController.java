package com.sujeet.bookmyticketprovider.restcontroller;

import com.sujeet.bookmyticketprovider.model.Passenger;
import com.sujeet.bookmyticketprovider.model.Ticket;
import com.sujeet.bookmyticketprovider.service.ITicketBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookticket")
public class BookMyTicketProviderRestController {

    @Autowired
    ITicketBookingService service;

    @PostMapping("/register")
    public ResponseEntity<Ticket> registerPassenger(@RequestBody Passenger passenger){
        Passenger p = service.registerPassenger(passenger);
        Ticket t = new Ticket();
        t.setTicketNumber(p.getPid());
        return new ResponseEntity<Ticket>(t, HttpStatus.OK);
    }

    @GetMapping("/fetch")
    public ResponseEntity<Ticket> fetchPassenger(Integer ticketNumber){
        Passenger p = service.fetchPassenger(ticketNumber);
        Ticket t = new Ticket();
        t.setTicketNumber(p.getPid());
        t.setName(p.getName());
        t.setDeparture(p.getDeparture());
        t.setArrival(p.getArrival());
        t.setDateOfJourney(p.getDateOfJourney());
        t.setStatus("Confirmed");
        return new ResponseEntity<Ticket>(t, HttpStatus.OK);
    }

}
