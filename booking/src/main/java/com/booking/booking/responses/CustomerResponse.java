package com.booking.booking.responses;

import com.booking.booking.model.Customer;
import java.util.List;

public class CustomerResponse {
    private List<Customer> customers;

    public CustomerResponse() {}

    public CustomerResponse(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
