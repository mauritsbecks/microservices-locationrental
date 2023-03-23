package soa.inquiry.assembler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import soa.inquiry.model.Location;

import java.util.Date;
import java.util.List;

@Component
public class InquiryAssembler {

    @Autowired
    private RestTemplate restTemplate;

    private static final String LOCATION_SERVICE_NAME = "locationApp";
    private static final String LOCATION_SERVICE_ENDPOINT = "/locations";

    public Location[] getAvailableLocations(Date date, int guests) {
        // request all locations
        // request bookings
        // calc which locations are available (based on date and capacity)
        // return these locations


        Location[] locations = restTemplate.exchange(
                getServiceURL(LOCATION_SERVICE_NAME, LOCATION_SERVICE_ENDPOINT), HttpMethod.GET, null, Location[].class).getBody();

        return locations;
    }

    private String getServiceURL(String serviceName,String serviceEndpoint){
        return new StringBuffer("http://").append(serviceName).append(serviceEndpoint).toString();
    }
}
