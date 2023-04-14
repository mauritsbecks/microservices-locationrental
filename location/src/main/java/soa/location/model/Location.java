package soa.location.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.*;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
<<<<<<< HEAD
public class Location {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int ID;

  public int getID() {
    return ID;
  }

  public void setID(int value) {
    this.ID = value;
  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String value) {
    this.name = value;
  }

  private String description;
=======
public class Location implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
>>>>>>> 3a7a2284ca75d721345cbb91173cefbe2f35ece9

  public String getDescription() {
    return description;
  }

  public void setDescription(String value) {
    this.description = value;
  }

  private Integer rental_Duration;

  public Integer getRental_Duration() {
    return rental_Duration;
  }

  public void setRental_Duration(Integer value) {
    this.rental_Duration = value;
  }

  private BigDecimal rental_Rate;

  public BigDecimal getRental_Rate() {
    return rental_Rate;
  }

  public void setRental_Rate(BigDecimal value) {
    this.rental_Rate = value;
  }

  private Integer rating;

  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer value) {
    this.rating = value;
  }

  private String special_Features;

  public String getSpecial_Features() {
    return special_Features;
  }

  public void setSpecial_Features(String value) {
    this.special_Features = value;
  }

  private String fulltext;

  public String getFulltext() {
    return fulltext;
  }

  public void setFulltext(String value) {
    this.fulltext = value;
  }

  private Timestamp last_Update;

  public Timestamp getLast_Update() {
    return last_Update;
  }

  public void setLast_Update(Timestamp value) {
    this.last_Update = value;
  }
/* 
  private Location_Category[] location_Category;

  public Location_Category[] getLocation_Category() {
    return location_Category;
  }

  public void setLocation_Category(Location_Category[] value) {
    this.location_Category = value;
  }

  private Inventory[] inventory;

  public Inventory[] getInventory() {
    return inventory;
  }

  public void setInventory(Inventory[] value) {
    this.inventory = value;
  } */

}