package com.example.demo.Entity;

import java.util.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket {
    
    private @Id  int Id;
    private String TicketId;
    private String CreatedBy;
    private String Priority;
    private Date CreatedTime;
    
    private Date RestoredTime;
    @Override
    public String toString() {
        return "Ticket [Id=" + Id + ", TicketId=" + TicketId + ", CreatedBy=" + CreatedBy + ", Priority=" + Priority + ",CreatedTime="
                + CreatedTime + ",  RestoredTime=" + RestoredTime + "]";
    }
    
    public int getId() {
        return Id;
    }
    public Ticket(){}
    public Ticket(int id, String ticketId, String createdBy, String priority, Date createdTime,  Date restoredTime) {
        Id = id;
        TicketId = ticketId;
        CreatedBy = createdBy;
        CreatedTime = createdTime;
        Priority = priority;
        RestoredTime = restoredTime;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getTicketId() {
        return TicketId;
    }
    public void setTicketId(String ticketId) {
        TicketId = ticketId;
    }
    public String getCreatedBy() {
        return CreatedBy;
    }
    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }
    public Date getCreatedTime() {
        return CreatedTime;
    }
    public void setCreatedTime(Date createdTime) {
        CreatedTime = createdTime;
    }
    public String getPriority() {
        return Priority;
    }
    public void setPriority(String priority) {
        Priority = priority;
    }
    public Date getRestoredTime() {
        return RestoredTime;
    }
    public void setRestoredTime(Date restoredTime) {
        RestoredTime = restoredTime;
    }
    

}
