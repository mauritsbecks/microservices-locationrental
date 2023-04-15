package com.booking.booking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Booking {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private int bookingId;
    
    private Date bookingDate;
    
    private String status;

    // Default constructor
    public Booking() {}

    // Constructor with parameters
    public Booking(int bookingId, Date bookingDate, String status) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.status = status;
    }
    
    // Getter and setter methods
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public int getBookingId() {
        return bookingId;
    }
    
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
    
    public Date getBookingDate() {
        return bookingDate;
    }
    
    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}