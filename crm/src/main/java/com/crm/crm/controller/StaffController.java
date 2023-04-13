package com.crm.crm.controller;
import com.crm.crm.model.Staff;
import com.crm.crm.entity.StaffResponse;
import com.crm.crm.repository.StaffRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class StaffController {

    @Autowired
    StaffRepository staffRepository;

    //Staff
    @GetMapping("/staff")
    public StaffResponse getAllStaff(){
        return new StaffResponse(staffRepository.findAll());
    }

    @PostMapping("/staff")
    public ResponseEntity<String> createStaff(@RequestBody Staff staff) {
        Staff savedStaff = staffRepository.save(staff);
        return ResponseEntity.ok("Staff created with ID: " + savedStaff.getID());
    }

}
