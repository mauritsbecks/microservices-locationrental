package com.booking.booking.entity;

import com.booking.booking.model.Customer;
import com.booking.booking.model.Location;
import com.booking.booking.model.Rental;

public class Booking {
    
    private Customer customer;
    private Location location;
    private Rental rental;

    public Booking(Rental rental) {
        this.rental = rental;
    }

    public Rental getRental() {
        return rental;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}