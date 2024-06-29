package com.sujeet.bookmyticketwebapp.controller;

import com.sujeet.bookmyticketwebapp.reqres.Passenger;
import com.sujeet.bookmyticketwebapp.reqres.Ticket;
import com.sujeet.bookmyticketwebapp.service.IBookMyTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookMyTicketController {

    @Autowired
    IBookMyTicketService service;

    @PostMapping("/book-ticket")
    public String bookTicket(@ModelAttribute Passenger passenger, Model model)
    {
        Ticket ticket=service.bookTicket(passenger);
        model.addAttribute("ticketNumber", ticket.getTicketNumber());
        return "index";//lvn
    }

    @GetMapping("/form")
    public String getForm(Model model)
    {
        model.addAttribute("passenger",new Passenger());
        return "index";
    }

    @GetMapping("/ticket")
    public String getTheTicketForm(Model model)
    {
        model.addAttribute("ticket", new Ticket());
        return "ticket-form";//lvn
    }

    @GetMapping("/get-ticket")
    public String getTheTicketDetails(@RequestParam("ticketNumber")Integer ticketNumber, Model model)
    {
        Ticket ticket=service.getFullTicket(ticketNumber);
        model.addAttribute("ticket", ticket);
        return "ticket-info";//lvn
    }

}
