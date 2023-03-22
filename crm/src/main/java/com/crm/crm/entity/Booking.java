package com.crm.crm.entity;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown = true)
public class Booking {

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