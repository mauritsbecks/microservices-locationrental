package com.crm.crm.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
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
