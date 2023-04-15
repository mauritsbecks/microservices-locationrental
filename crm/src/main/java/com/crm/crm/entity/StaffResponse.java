package com.crm.crm.entity;
import com.crm.crm.model.Staff;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class StaffResponse {
    private List<Staff> staff;

    public StaffResponse() {}

    public StaffResponse(List<Staff> staff) {
        this.staff = staff;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }
}
