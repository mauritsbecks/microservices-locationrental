package soa.location.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import soa.location.repository.LocationRepository;
<<<<<<< HEAD
import soa.location.responses.LocationResponse;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Optional;
import java.math.BigDecimal;

@RestController
=======
import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
>>>>>>> 3a7a2284ca75d721345cbb91173cefbe2f35ece9
public class LocationController {

    @Autowired
    LocationRepository locationRepository;

<<<<<<< HEAD
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
=======
    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("locations", locationRepository.findAll());
        return "dashboard";
>>>>>>> 3a7a2284ca75d721345cbb91173cefbe2f35ece9
    }
}
