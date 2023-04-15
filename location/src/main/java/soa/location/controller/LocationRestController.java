package soa.location.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import soa.location.model.Location;
import soa.location.repository.LocationRepository;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
public class LocationRestController {

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

    @RequestMapping(value = "/locations", headers="Content-Type=application/x-www-form-urlencoded", method = RequestMethod.POST)
    public void saveLocation(HttpServletResponse response, @ModelAttribute Location location) throws IOException {
        locationRepository.save(location);
        response.sendRedirect("/dashboard");
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
