package com.booking.booking.entity;


import java.util.List;

public class LocationResponse {

    private List<Location> locations;

    public LocationResponse(List<Location> locations) {

    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }
}

    

