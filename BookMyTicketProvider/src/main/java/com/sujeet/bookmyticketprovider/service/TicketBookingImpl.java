package com.sujeet.bookmyticketprovider.service;

import com.sujeet.bookmyticketprovider.dao.ITicketRepo;
import com.sujeet.bookmyticketprovider.model.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketBookingImpl implements ITicketBookingService{

    @Autowired
    ITicketRepo repo;

    @Override
    public Passenger registerPassenger(Passenger passenger) {
        return repo.save(passenger);
    }

    @Override
    public Passenger fetchPassenger(Integer id) {
        Optional<Passenger> p = repo.findById(id);
        return p.orElseThrow();
    }
}
