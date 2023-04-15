package com.crm.crm.repository;

import org.springframework.data.repository.CrudRepository;
import com.crm.crm.model.Staff;

import java.util.List;

public interface StaffRepository extends CrudRepository<Staff, Integer> {

    List<Staff> findAll();

    Staff save(Staff staff);

     //Finds a Customer object with the specified id.
     //Customer findById(Long id);
    
}