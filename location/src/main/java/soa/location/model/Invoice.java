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
public class Invoice {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int ID;

  public int getID() {
    return ID;
  }

  public void setID(int value) {
    this.ID = value;
  }

  private BigDecimal amount;

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal value) {
    this.amount = value;
  }

  private Timestamp payment_Date;

  public Timestamp getPayment_Date() {
    return payment_Date;
  }

  public void setPayment_Date(Timestamp value) {
    this.payment_Date = value;
  }
  @Column(name = "RentalID")
  private int rentalId;

  public int getRentalId() {
    return rentalId;
  }

  public void setRentalId(int value) {
    this.rentalId = value;
  }
  @Column(name = "CustomerID")
  private int customerId;

  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int value) {
    this.customerId = value;
  }
/*   @Column(name = "StaffID")
  private int staffId;

  public int getStaffId() {
    return staffId;
  }

  public void setStaffId(int value) {
    this.staffId = value;
  } */

}