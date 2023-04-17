package com.booking.booking.controller;

import com.booking.booking.assembler.BookAssembler;
import com.booking.booking.responses.BookingResponse;
import com.booking.booking.responses.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.booking.booking.assembler.RentalAssembler;


@Controller
@RequestMapping("/")
public class BookingController {

    @Autowired
    RentalAssembler rentalAssembler;

    @Autowired
    BookAssembler bookAssembler;

    @GetMapping("/bookings")
    public String bookings(Model model) {
        BookingResponse bookings = new BookingResponse(rentalAssembler.getCustomerRentals());
        model.addAttribute("bookings", bookings.getBookings());
        return "bookings";
    }

    @GetMapping("book")
    public String book(Model model) {
        model.addAttribute("locations", bookAssembler.getLocations());
        model.addAttribute("customers", bookAssembler.getCustomers());
        return "book";
    }

}
