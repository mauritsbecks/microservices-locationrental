package com.crm.crm.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
