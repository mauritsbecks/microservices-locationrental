package com.booking.booking.responses;
import com.booking.booking.model.*;

import java.util.List;

public class RentalResponse {
    private List<Rental> rentals;

    public RentalResponse() {
    }

    public RentalResponse(List<Rental> rentals) {
        this.rentals = rentals;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }
}
