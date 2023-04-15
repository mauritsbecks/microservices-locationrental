package soa.location.responses;

import soa.location.model.Location;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


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
