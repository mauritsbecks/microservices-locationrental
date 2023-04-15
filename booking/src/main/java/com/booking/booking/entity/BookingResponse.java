package com.booking.booking.entity;

import java.util.List;

public class BookingResponse {
    
    private List<Booking> bookings;

    public BookingResponse(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}