package com.booking.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.booking.assembler.RentalAssembler;
import com.booking.booking.entity.*;
import com.booking.booking.repository.BookingRepository;
import com.booking.booking.responses.BookingResponse;
import com.booking.booking.responses.RentalResponse;


@RestController
public class BookingController {
    
    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    RentalAssembler rentalAssembler;

    @GetMapping("/rentals")
    public RentalResponse getAllRentals(){
        return new RentalResponse(bookingRepository.findAll());
    }

    @GetMapping("/bookings")
    public BookingResponse getAllBookings(){
        return new BookingResponse(rentalAssembler.getCustomerRentals());
    } 

}
