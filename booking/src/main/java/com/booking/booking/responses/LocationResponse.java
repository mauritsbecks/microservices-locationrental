package com.booking.booking.responses;


import java.util.List;

import com.booking.booking.model.Location;


public class LocationResponse {
    private List<Location> location;

    public LocationResponse() {}

    public LocationResponse(List<Location> location) {
        this.location = location;
    }

    public List<Location> getLocation() {
        return location;
    }

    public void setLocation(List<Location> location) {
        this.location = location;
    }
}
