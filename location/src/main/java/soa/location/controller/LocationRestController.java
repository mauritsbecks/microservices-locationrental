package soa.location.controller;

//import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import soa.location.model.Location;
import soa.location.repository.LocationRepository;
//import java.io.IOException;
import java.math.BigDecimal;
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
    public Location getLocation(@PathVariable Integer id) {
        return locationRepository.findById(id).get();
    }

    @PostMapping("/locations")
    public ResponseEntity<String> createLocation(@RequestBody Location location) {
        Location savedLocation = locationRepository.save(location);
        return ResponseEntity.ok("Location created with ID: " + savedLocation.getID());
    }

    @PutMapping("/locations/{id}")
    public ResponseEntity editLocation(
            @PathVariable Integer id,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String description,
            @RequestParam(required = false) Integer rentalDuration,
            @RequestParam(required = false) BigDecimal rentalRate,
            @RequestParam(required = false) Integer rating) {
        // Find location by ID
        Optional<Location> optionalLocation = locationRepository.findById(id);
        if (optionalLocation.isPresent()) {
            Location location = optionalLocation.get();
            // Update name and description if they are not null
            if (name != null) {
                location.setName(name);
            }

            if (description != null) {
                location.setDescription(description);
            }

            if (rentalDuration != null) {
                location.setRental_Duration(rentalDuration);
            }

            if (rentalRate != null) {
                location.setRental_Rate(rentalRate);
            }

            if (rating != null) {
                location.setRating(rating);
            }
            // Save updated location
            locationRepository.save(location);
            return ResponseEntity.ok("Location edited with ID: " + location.getID());
        }
        return ResponseEntity.badRequest().body("Not able to update the location");
    }


    @DeleteMapping("/locations/{id}")
    public boolean deleteLocation(@PathVariable Integer id) {
        Optional<Location> location = locationRepository.findById(id);

        if (location.isPresent()) {
            locationRepository.delete(location.get());
            return true;
        } else {
            return false;
        }
    }

//    @GetMapping("/locations")
//    public List<Location> getLocations() {
//        return locationRepository.findAll();
//    }
//
//    @GetMapping("/locations/{id}")
//    public Location getLocation(@PathVariable Long id) {
//        return locationRepository.findById(id).get();
//    }
//
//    @RequestMapping(value = "/locations", headers="Content-Type=application/x-www-form-urlencoded", method = RequestMethod.POST)
//    public void saveLocation(HttpServletResponse response, @ModelAttribute Location location) throws IOException {
//        locationRepository.save(location);
//        response.sendRedirect("/dashboard");
//    }
//
//    @DeleteMapping("/locations/{id}")
//    public boolean deleteLocation(@PathVariable Long id) {
//        Optional<Location> location = locationRepository.findById(id);
//
//        if (location.isPresent()) {
//            locationRepository.delete(location.get());
//            return true;
//        } else {
//            return false;
//        }
//    }
}
