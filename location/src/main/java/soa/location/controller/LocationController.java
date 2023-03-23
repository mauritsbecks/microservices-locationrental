package soa.location.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import soa.location.model.Location;
import soa.location.repository.LocationRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class LocationController {

    @Autowired
    LocationRepository locationRepository;

    @GetMapping("/locations")
    public List<Location> getLocations() {
        return locationRepository.findAll();
    }

    @GetMapping("/locations/{id}")
    public Location getLocation(@PathVariable Long id) {
        return locationRepository.findById(id).get();
    }

    @PostMapping("/locations")
    public Location saveLocation(@RequestBody Location location) {
        // TODO FIX
        return locationRepository.save(location);
    }

    @PutMapping("/locations/{id}")
    public boolean editLocation(@PathVariable Long id) {
        // TODO IMPLEMENT
        return false;
    }

    @DeleteMapping("/locations/{id}")
    public boolean deleteLocation(@PathVariable Long id) {
        Optional<Location> location = locationRepository.findById(id);

        if (location.isPresent()) {
            locationRepository.delete(location.get());
            return true;
        } else {
            return false;
        }
    }
}
