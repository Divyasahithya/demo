package com.example.demo.Entity;

import java.time.LocalDateTime;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Nonnull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Id int Id;
    private String ticketId;
    private String createdBy;
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    private String priority;
    private LocalDateTime createdTime;
    private String status;
    @Nonnull
    private String title;
    private String description;
    private LocalDateTime restoredTime;

    @Override
    public String toString() {
        return "Ticket [Id=" + Id + ", ticketId=" + ticketId + ", createdBy=" + createdBy + ", priority=" + priority
                + ", createdTime=" + createdTime + ", status=" + status + ", title=" + title + ", description="
                + description + ", restoredTime=" + restoredTime + "]";
    }

    public int getId() {
        return Id;
    }

    public Ticket() {
    }

    
    public void setId(int id) {
        Id = id;
    }

    public String getTicketId() {
        return ticketId;
    }

    public Ticket(String ticketId, String createdBy, String priority, String title, String description) {
        this.ticketId = ticketId;
        this.createdBy = createdBy;
        this.priority = priority;
        this.title = title;
        this.description = description;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public LocalDateTime getRestoredTime() {
        return restoredTime;
    }

    public void setRestoredTime(LocalDateTime restoredTime) {
        this.restoredTime = restoredTime;
    }

}
