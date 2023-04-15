package com.crm.crm.controller;

import com.crm.crm.entity.CustomerResponse;
import com.crm.crm.repository.CustomerRepository;
import com.crm.crm.entity.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    //Customer
    @GetMapping("/customers")
    public CustomerResponse getAllCustomers(){
        return new CustomerResponse(customerRepository.findAll());
    }

    @PostMapping("/customers")
    public ResponseEntity<String> createCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerRepository.save(customer);
        return ResponseEntity.ok("Customer created with ID: " + savedCustomer.getID());
    }


}
