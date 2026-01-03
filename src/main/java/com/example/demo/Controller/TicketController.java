package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Ticket;
import com.example.demo.Repository.TicketRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class TicketController {
    @Autowired TicketRepository ticketRepository;
    @GetMapping("/Tickets")
    public List<Ticket> getMethodName() {
        return (ticketRepository.findAll());
    }
    

}
