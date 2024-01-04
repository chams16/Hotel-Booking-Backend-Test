package com.chams.hotel.HotelBook.handlers;

import com.chams.hotel.HotelBook.exception.ExceptionRepresentation;
import com.chams.hotel.HotelBook.exception.HotelNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(HotelNotFoundException.class)
    public ResponseEntity<ExceptionRepresentation> handleException(){
        ExceptionRepresentation exceptionRepresentation = ExceptionRepresentation.builder()
                .errorMessage("Hotel not found Exception")
                .build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exceptionRepresentation);
    }
}
