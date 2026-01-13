package com.example.demo.DTO;

import java.time.LocalDateTime;

public class ErrorResponse {
    private int statusCode;
    private String message;
    private String path;
    private String error;
    public int getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
    private LocalDateTime timestamp;
    public ErrorResponse(int statusCode, String message, String path, String error, LocalDateTime timestamp) {
        this.statusCode = statusCode;
        this.message = message;
        this.path = path;
        this.error = error;
        this.timestamp = timestamp;
    }

}
