package com.booking.booking.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.booking.booking.model.*;
/**
 * @author Amol Limaye
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerRental {

    Rental rental;

    Customer customer;
   

    public CustomerRental(Rental rental){
        this.rental = rental;
    }

    public Rental getCustomerRental() {
        return rental;
    }

    public void setCustomerRental(Rental rental) {
        this.rental = rental;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setImage(Customer customer) {
        this.customer = customer;
    }

}
