package com.crm.crm.repository;

import org.springframework.data.repository.CrudRepository;
import com.crm.crm.entity.Customer;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    List<Customer> findAll();

    Customer save(Customer customer);

     //Finds a Customer object with the specified id.
     //Customer findById(Long id);
    
}