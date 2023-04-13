package soa.location.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.*;


@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Category {
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

  private Timestamp last_Update;

  public Timestamp getLast_Update() {
    return last_Update;
  }

  public void setLast_Update(Timestamp value) {
    this.last_Update = value;
  }

  private Location_Category[] location_Category;

  public Location_Category[] getLocation_Category() {
    return location_Category;
  }

  public void setLocation_Category(Location_Category[] value) {
    this.location_Category = value;
  }

}