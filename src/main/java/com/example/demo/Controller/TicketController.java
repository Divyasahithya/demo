package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Ticket;

import com.example.demo.Service.TicketService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class TicketController {
    @Autowired
    TicketService tService;

    @GetMapping("/Tickets")
    public List<Ticket> getTickets() {
        return (tService.GetAllTickets());
    }

    @GetMapping("/Ticket/{Id}")
    public Optional<Ticket> getTicketByID(@PathVariable int Id) {
        return (tService.getTicketById(Id));
    }

}
