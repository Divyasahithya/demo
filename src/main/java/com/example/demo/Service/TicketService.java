package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Ticket;
import com.example.demo.Repository.TicketRepository;

@Service
public class TicketService {
    

    private TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }
   public List<Ticket> GetAllTickets(){
     return ticketRepository.findAll();
   }
   public Optional<Ticket> getTicketById(Integer id){
    return ticketRepository.findById(id);
   }


}
