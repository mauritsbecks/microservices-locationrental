package soa.location.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.*;


@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Location_Category {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int ID;

  public int getID() {
    return ID;
  }

  public void setID(int value) {
    this.ID = value;
  }

  private Timestamp last_Update;

  public Timestamp getLast_Update() {
    return last_Update;
  }

  public void setLast_Update(Timestamp value) {
    this.last_Update = value;
  }
  @Column(name = "CategoryID")
  private int categoryId;

  public int getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(int value) {
    this.categoryId = value;
  }
  @Column(name = "LocationID")
  private int locationId;

  public int getLocationId() {
    return locationId;
  }

  public void setLocationId(int value) {
    this.locationId = value;
  }

}