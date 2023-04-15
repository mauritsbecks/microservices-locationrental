package com.booking.booking.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;


@RefreshScope
@Component
public class ExternalConfig {

    //To add this property in consul UI, add it as config/booking-service/useLocations
    //and add its value as true

    @Value("${useLocations:true}")
    private String useLocations;

    public boolean getUseLocations() {
        return Boolean.parseBoolean(useLocations);
    }

    public void setUseLocations(String useLocations) {
        this.useLocations = useLocations;
    }
}
