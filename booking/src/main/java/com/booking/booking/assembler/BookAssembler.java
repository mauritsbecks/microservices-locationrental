package com.booking.booking.assembler;

import com.booking.booking.model.Customer;
import com.booking.booking.model.Location;
import com.booking.booking.responses.CustomerResponse;
import com.booking.booking.responses.LocationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class BookAssembler {
    @Autowired
    private RestTemplate restTemplate;

    private static final String CUSTOMER_SERVICE_ID = "crmApp";
    private static final String CUSTOMER_SERVICE_ENDPOINT = "/crm-service/customers";

    private static final String LOCATION_SERVICE_ID = "locationApp";
    private static final String LOCATION_SERVICE_ENDPOINT = "/location-service/locations";

    private String getServiceURL(String serviceId,String serviceEndpoint){
        return new StringBuffer("http://").append(serviceId)
                .append(serviceEndpoint).toString();
    }

    public List<Customer> getCustomers() {
        ResponseEntity<CustomerResponse> customerResponseResponseEntity = restTemplate.exchange(
                getServiceURL(CUSTOMER_SERVICE_ID, CUSTOMER_SERVICE_ENDPOINT),
                HttpMethod.GET, null, CustomerResponse.class);
        return customerResponseResponseEntity.getBody().getCustomers();
    }

    public List<Location> getLocations() {
        ResponseEntity<LocationResponse> locationResponseResponseEntity = restTemplate.exchange(
                getServiceURL(LOCATION_SERVICE_ID, LOCATION_SERVICE_ENDPOINT),
                HttpMethod.GET, null, LocationResponse.class);
        return locationResponseResponseEntity.getBody().getLocation();
    }
}
