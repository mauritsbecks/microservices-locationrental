package com.booking.booking.controller;

import com.booking.booking.assembler.RentalAssembler;
import com.booking.booking.model.Rental;
import com.booking.booking.repository.BookingRepository;
import com.booking.booking.responses.BookingResponse;
import com.booking.booking.responses.RentalResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BookingRestController {
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

    @PostMapping("/bookings")
    public ResponseEntity<String> newBooking(Rental rental) {
        Rental savedRental = bookingRepository.save(rental);
        return ResponseEntity.ok("Booking created with ID: " + savedRental.getID());
    }
}
