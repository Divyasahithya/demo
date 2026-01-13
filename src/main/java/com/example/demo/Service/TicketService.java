package com.example.demo.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.ErrorResponse;
import com.example.demo.Entity.Ticket;

import com.example.demo.Repository.TicketRepository;

@Service
public class TicketService {

  private final TicketRepository ticketRepository;

  public TicketService(final TicketRepository ticketRepository) {
    this.ticketRepository = ticketRepository;

  }

  public List<Ticket> GetAllTickets() {
    return ticketRepository.findAll();
  }

  public Ticket getTicketById(final Integer id) {
    return ticketRepository.findById(id).orElseThrow();

  }
  public List<Ticket> getTicketByPriority(final String priority) {
    return ticketRepository.findByPriority(priority);

  }
  public List<Ticket> getTicketByStatus(final String status) {
    return ticketRepository.findByStatus(status);

  }
  public ResponseEntity<ErrorResponse> RemoveTicketById(final Integer id) {
  if(!ticketRepository.findById(id).isEmpty()){
        ErrorResponse response = new ErrorResponse(HttpStatus.CREATED.value(), "successfully deleted",
              "/RemoveTicket", null, LocalDateTime.now());
              ticketRepository.deleteById(id);
              
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
       }
         else  
         {
            ErrorResponse response1 = new ErrorResponse(HttpStatus.NOT_FOUND.value(), "Id not found",
              "/RemoveTicket", null, LocalDateTime.now());
             return new ResponseEntity<>(response1, HttpStatus.NOT_FOUND);   
         }
   

  }

  public ResponseEntity<ErrorResponse> CreateTicket(final Ticket ticket) {
    ticket.setCreatedTime(LocalDateTime.now());
    ticket.setStatus("Open");
    ticketRepository.save(ticket);
    ErrorResponse response = new ErrorResponse(HttpStatus.CREATED.value(), "successfully added",
              "/CreateTicket", null, LocalDateTime.now());
    return new ResponseEntity<>(response, HttpStatus.CREATED);
    
    
  }
  public Ticket UpdateTicket(Ticket ticket){
    ticket.setStatus("Inprogress");
    ticketRepository.save(ticket);
    return ticket;
  }

}
