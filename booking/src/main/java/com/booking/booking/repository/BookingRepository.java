package com.booking.booking.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import com.booking.booking.entity.Booking;

import java.util.Date;

public interface BookingRepository extends CrudRepository<Booking,Long> {
    List<Booking> findAll();

    //Finds all the Booking objects with the specified bookingDate
    List<Booking> findByBookingDate(Date bookingDate);
    //Finds all the Booking objects with the specified status.
    List<Booking> findByStatus(String status);
    //Finds a Booking object with the specified id and status.
    Booking findByIdAndStatus(Long id, String status);
    //Deletes all the Booking objects with bookingDate before the specified date.
    void deleteByBookingDateBefore(Date date);

   

}
