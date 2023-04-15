package soa.location.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.*;


@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int ID;

  public int getID() {
    return ID;
  }

  public void setID(int value) {
    this.ID = value;
  }

  private String address;

  public String getAddress() {
    return address;
  }

  public void setAddress(String value) {
    this.address = value;
  }

  private String postal_Code;

  public String getPostal_Code() {
    return postal_Code;
  }

  public void setPostal_Code(String value) {
    this.postal_Code = value;
  }

  private Timestamp last_Update;

  public Timestamp getLast_Update() {
    return last_Update;
  }

  public void setLast_Update(Timestamp value) {
    this.last_Update = value;
  }

  @Column(name = "CityID")
  private String cityId;

  public String getCityId() {
    return cityId;
  }

  public void setCityId(String value) {
    this.cityId = value;
  }

  private int customerId;

  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int value) {
    this.customerId = value;
  }

  private int[] staffIds;

  public int[] getStaff() {
    return staffIds;
  }

  public void setStaff(int[] value) {
    this.staffIds = value;
  }

}