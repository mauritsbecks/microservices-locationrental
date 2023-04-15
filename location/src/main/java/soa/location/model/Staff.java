package soa.location.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.*;


@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Staff {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int ID;

  public int getID() {
    return ID;
  }

  public void setID(int value) {
    this.ID = value;
  }
  /* 
  private int invoiceID;

  public int getInvoiceID() {
    return invoiceID;
  }

  public void setInvoiceID(int value) {
    this.invoiceID = value;
  } */

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

  private Character active;

  public Character getActive() {
    return active;
  }

  public void setActive(Character value) {
    this.active = value;
  }

  private String username;

  public String getUsername() {
    return username;
  }

  public void setUsername(String value) {
    this.username = value;
  }

  private String password;

  public String getPassword() {
    return password;
  }

  public void setPassword(String value) {
    this.password = value;
  }

  private String pictureURL;

  public String getPictureURL() {
    return pictureURL;
  }

  public void setPictureURL(String value) {
    this.pictureURL = value;
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

 /*  private Rental[] rental;

  public Rental[] getRental() {
    return rental;
  }

  public void setRental(Rental[] value) {
    this.rental = value;
  } */

/*   private Invoice[] invoice;

  public Invoice[] getInvoice() {
    return invoice;
  }

  public void setInvoice(Invoice[] value) {
    this.invoice = value;
  }
 */
}