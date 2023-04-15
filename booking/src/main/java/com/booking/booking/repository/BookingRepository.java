package com.booking.booking.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import com.booking.booking.model.Rental;

import java.sql.Timestamp;
import java.util.Date;

public interface BookingRepository extends CrudRepository<Rental,Integer> {
    List<Rental> findAll();

    //Finds all the Booking objects with the specified bookingDate
    //List<Rental> findByrental_StartDate(Timestamp rental_StartDate);
    //Finds all the Booking objects with the specified status.
    //List<Rental> findByStatus(String status);
    //Finds a Booking object with the specified id and status.
    //Rental findByIdAndStatus(Integer id, String status);
    //Deletes all the Booking objects with bookingDate before the specified date.
    //void deleteByBookingDateBefore(Timestamp date);

}
