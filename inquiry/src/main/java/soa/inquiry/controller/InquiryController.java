package soa.inquiry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import soa.inquiry.assembler.InquiryAssembler;
import soa.inquiry.model.Location;

import java.util.Date;
import java.util.List;

@RestController
public class InquiryController {
    @Autowired
    InquiryAssembler inquiryAssembler;

    @GetMapping("/inquiry?date={date}&guests={guests}")
    public Location[] getAvailableLocations(@RequestParam Date date, @RequestParam int guests) {
        return inquiryAssembler.getAvailableLocations(date, guests);
    }
}
