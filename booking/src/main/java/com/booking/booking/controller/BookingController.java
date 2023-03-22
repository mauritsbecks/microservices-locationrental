package com.booking.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.booking.entity.BookingResponse;
import com.booking.booking.repository.BookingRepository;

@RestController
public class BookingController {
    
    @Autowired
    BookingRepository bookingRepository;

    @GetMapping("/bookings")
    public BookingResponse getAllBookings(){
        return new BookingResponse(bookingRepository.findAll());
    }

}
