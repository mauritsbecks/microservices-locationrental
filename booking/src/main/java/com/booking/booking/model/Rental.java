package com.booking.booking.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.*;


@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Rental {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int ID;

  public int getID() {
    return ID;
  }

  public void setID(int value) {
    this.ID = value;
  }

  private Timestamp rental_StartDate;

  public Timestamp getRental_StartDate() {
    return rental_StartDate;
  }

  public void setRental_StartDate(Timestamp value) {
    this.rental_StartDate = value;
  }
  
  private Timestamp rental_EndDate;

  public Timestamp getRental_EndDate() {
    return rental_EndDate;
  }
  
  public void setRental_EndDate(Timestamp value) {
    this.rental_EndDate = value;
  }

  private Timestamp last_Update;

  public Timestamp getLast_Update() {
    return last_Update;
  }

  public void setLast_Update(Timestamp value) {
    this.last_Update = value;
  }

  @Column(name = "StaffID")
  private int staffId;

  public int getStaff() {
    return staffId;
  }

  public void setStaff(int value) {
    this.staffId = value;
  }

  @Column(name = "InventoryID")
  private int inventoryId;

  public int getInventoryId() {
    return inventoryId;
  }

  public void setInventoryId(int value) {
    this.inventoryId = value;
  }
  @Column(name = "CustomerID")
  private int customerId;

  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int value) {
    this.customerId = value;
  }

/*   private int[] invoiceIds;

  public int[] getInvoiceIds() {
    return invoiceIds;
  }

  public void setInvoiceIds(int[] value) {
    this.invoiceIds = value;
  } */

}