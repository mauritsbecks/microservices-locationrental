package com.booking.booking.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Location {

      
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private int locationId;

    private String locationName;

    private int standardPrice;

    private Boolean isAvailable;

        // Getter for id
        public Long getId() {
            return id;
        }
        
        // Setter for id
        public void setId(Long id) {
            this.id = id;
        }
    
        // Getter for bookingId
        public int getLocationId() {
            return locationId;
        }
    
        // Setter for bookingId
        public void setLocationId(int locationId) {
            this.locationId = locationId;
        }
    
        // Getter for locationName
        public String getLocationName() {
            return locationName;
        }
    
        // Setter for locationName
        public void setLocationName(String locationName) {
            this.locationName = locationName;
        }
    
        // Getter for standardPrice
        public int getStandardPrice() {
            return standardPrice;
        }
    
        // Setter for standardPrice
        public void setStandardPrice(int standardPrice) {
            this.standardPrice = standardPrice;
        }
    
        // Getter for isAvailable
        public Boolean getIsAvailable() {
            return isAvailable;
        }
    
        // Setter for isAvailable
        public void setIsAvailable(Boolean isAvailable) {
            this.isAvailable = isAvailable;
        }
    
}
