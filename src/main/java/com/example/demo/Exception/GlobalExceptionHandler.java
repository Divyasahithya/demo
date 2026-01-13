package com.example.demo.Exception;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.DTO.ErrorResponse;

import jakarta.servlet.http.HttpServletRequest;

 @ControllerAdvice
public class GlobalExceptionHandler {
   
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorResponse> CheckValidation(IllegalArgumentException e,HttpServletRequest request) {
       
         ErrorResponse error = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), "ValidationError",
                request.getRequestURI(), e.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<ErrorResponse> HandleResourceNotFoundException(NoSuchElementException e, HttpServletRequest request) {
         ErrorResponse error = new ErrorResponse(HttpStatus.NOT_FOUND.value(), "No data found",
                request.getRequestURI(), e.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorResponse> ServerException(RuntimeException e,
            HttpServletRequest request) {
        ErrorResponse error = new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Server Error",
                request.getRequestURI(), e.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

     
} 
