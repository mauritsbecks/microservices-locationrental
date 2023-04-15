package soa.location.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import soa.location.repository.LocationRepository;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
public class LocationController {

    @Autowired
    LocationRepository locationRepository;

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("locations", locationRepository.findAll());
        return "dashboard";
    }
}
