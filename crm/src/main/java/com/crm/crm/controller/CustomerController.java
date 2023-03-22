package com.crm.crm.controller;

import com.crm.crm.entity.CustomerResponse;
import com.crm.crm.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/customers")
    public CustomerResponse getAllCustomers(){
        return new CustomerResponse(customerRepository.findAll());
    }
}
