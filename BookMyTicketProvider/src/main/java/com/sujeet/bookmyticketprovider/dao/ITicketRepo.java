package com.sujeet.bookmyticketprovider.dao;

import com.sujeet.bookmyticketprovider.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITicketRepo extends JpaRepository<Passenger, Integer> {
}
