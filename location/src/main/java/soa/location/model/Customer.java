package soa.location.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.*;


@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Customer {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int ID;

  public int getID() {
    return ID;
  }

  public void setID(int value) {
    this.ID = value;
  }

  private String first_Name;

  public String getFirst_Name() {
    return first_Name;
  }

  public void setFirst_Name(String value) {
    this.first_Name = value;
  }

  private String last_Name;

  public String getLast_Name() {
    return last_Name;
  }

  public void setLast_Name(String value) {
    this.last_Name = value;
  }

  private String email;

  public String getEmail() {
    return email;
  }

  public void setEmail(String value) {
    this.email = value;
  }

  private Integer phone;

  public Integer getPhone() {
    return phone;
  }

  public void setPhone(Integer value) {
    this.phone = value;
  }

  private Character active;

  public Character getActive() {
    return active;
  }

  public void setActive(Character value) {
    this.active = value;
  }

  private Timestamp create_Date;

  public Timestamp getCreate_Date() {
    return create_Date;
  }

  public void setCreate_Date(Timestamp value) {
    this.create_Date = value;
  }

  private Timestamp last_Update;

  public Timestamp getLast_Update() {
    return last_Update;
  }

  public void setLast_Update(Timestamp value) {
    this.last_Update = value;
  }
  @Column(name = "AddressID")
  private int addressId;

  public int getAddressId() {
    return addressId;
  }

  public void setAddressId(int value) {
    this.addressId = value;
  }

/*   private int[] invoiceIds;

  public int[] getInvoiceIds() {
    return invoiceIds;
  }

  public void setInvoiceIds(int[] value) {
    this.invoiceIds = value;
  }

  private int[] rental;

  public int[] getRental() {
    return rental;
  }

  public void setRental(int[] value) {
    this.rental = value;
  } */

}