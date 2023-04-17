package com.booking.booking.assembler;

import com.booking.booking.config.ExternalConfig;
import com.booking.booking.entity.Booking;
import com.booking.booking.model.*;
import com.booking.booking.responses.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import com.booking.booking.repository.BookingRepository;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.List;


@Component
public class RentalAssembler {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ExternalConfig externalConfig;

    @Autowired
    BookingRepository bookingRepository;

    private static final String CUSTOMER_SERVICE_ID = "crmApp";
    private static final String CUSTOMER_SERVICE_ENDPOINT = "/crm-service/customers";

    private static final String LOCATION_SERVICE_ID = "locationApp";
    private static final String LOCATION_SERVICE_ENDPOINT = "/location-service/locations";

    public List<Booking> getCustomerRentals(){
        ResponseEntity<CustomerResponse> customerResponse = restTemplate.exchange(
                getServiceURL(CUSTOMER_SERVICE_ID,CUSTOMER_SERVICE_ENDPOINT),
                HttpMethod.GET,null,CustomerResponse.class);
        
         ResponseEntity<LocationResponse> locationResponse = restTemplate.exchange(
            getServiceURL(LOCATION_SERVICE_ID, LOCATION_SERVICE_ENDPOINT),
                HttpMethod.GET, null, LocationResponse.class);
  
        /*  ResponseEntity<List<LocationResponse>> locationResponse = restTemplate.exchange(
            getServiceURL(LOCATION_SERVICE_ID, LOCATION_SERVICE_ENDPOINT),
            HttpMethod.GET, null, new ParameterizedTypeReference<List<LocationResponse>>() {});
 */
        RentalResponse rentalResponse = new RentalResponse(bookingRepository.findAll());
        
        return mergeRentalData(customerResponse, locationResponse, ResponseEntity.ok(rentalResponse));
    }

    private String getServiceURL(String serviceId,String serviceEndpoint){
        return new StringBuffer("http://").append(serviceId)
                .append(serviceEndpoint).toString();
    }

    private List<Booking> mergeRentalData(ResponseEntity<CustomerResponse> customerResponse, ResponseEntity<LocationResponse> locationResponse, ResponseEntity<RentalResponse> rentalResponse){
        List<Booking> bookings = new ArrayList<>();
        
        for(Rental rental:rentalResponse.getBody().getRentals()){
            Booking booking = new Booking(rental);
                
            if(customerResponse!=null){
                Customer customer = customerResponse.getBody().getCustomers().
                            stream().filter(i -> rental.getCustomerId() == i.getID())
                            .findAny().orElse(null);
                    booking.setCustomer(customer);                
            }

             if(locationResponse!=null){
                Location location = locationResponse.getBody().getLocation().
                            stream().filter(i -> rental.getInventoryId() == i.getID())
                            .findAny().orElse(null);
                    booking.setLocation(location);                
            }  

     /*        if(locationResponse!=null){
                List<Location> locations = locationResponse.getBody().stream()
                        .filter(i -> rental.getInventoryId() == i.getID())
                        .collect(Collectors.toList());
                if(!locations.isEmpty()){
                    booking.setLocation(locations.get(0));
                }
            } */


            bookings.add(booking);  
        
        }

        return bookings;
    }
}
