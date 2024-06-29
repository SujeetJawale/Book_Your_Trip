package com.sujeet.bookmyticketprovider.service;

import com.sujeet.bookmyticketprovider.model.Passenger;

public interface ITicketBookingService {

    public Passenger registerPassenger(Passenger passenger);
    public Passenger fetchPassenger(Integer id);
}
