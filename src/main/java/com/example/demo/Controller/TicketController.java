package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.DTO.ErrorResponse;
import com.example.demo.Entity.Ticket;
import com.example.demo.Service.TicketService;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class TicketController {
    @Autowired
    TicketService tService;
    Ticket ticket;

    @GetMapping("/Tickets")
    public List<Ticket> getTickets() {
        return (tService.GetAllTickets());
    }

    @GetMapping("/Ticket/{Id}")
    public Ticket getTicketByID( @Validated @PathVariable int Id) {
        return (tService.getTicketById(Id));
    }
    
    @GetMapping("/TicketByStatus/{status}")
    public List<Ticket> getTicketByStatus( @Validated @PathVariable String status) {
        return (tService.getTicketByStatus(status));
    }
    @GetMapping("/TicketByPriority/{priority}")
    public List<Ticket> getTicketByPriority( @Validated @PathVariable String priority) {
        return (tService.getTicketByPriority(priority));
    }
    @PostMapping("/createTicket")
    public ResponseEntity<ErrorResponse> CreateTicket( @RequestBody Ticket ticket) {
        return tService.CreateTicket(ticket);
    }  
        
    @DeleteMapping("/RemoveTicket/{Id}")
    public ResponseEntity<ErrorResponse> RemoveById( @PathVariable int Id){
        return tService.RemoveTicketById(Id);
    }
    @PutMapping("UpdateTicket/{id}")
    public Ticket putMethodName(@PathVariable String id, @RequestBody Ticket ticket) {
        tService.UpdateTicket(ticket);
         return ticket;
    }
}
