package com.invoicing.invoicing.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String invoiceId;

    private String customerId;

    private String bookingId;

    private String status;

    private Double totalPrice;

    // Getters
    public Long getId() {
        return id;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getStatus() {
        return status;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

}