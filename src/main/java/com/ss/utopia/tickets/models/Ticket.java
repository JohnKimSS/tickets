package com.ss.utopia.tickets.models;


import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Ticket {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Long flightId;

  private Long customerId;

  private String passenger;

  private boolean isCheckedIn;

  public boolean isCheckedIn() {
    return isCheckedIn;
  }

  public void setCheckedIn(boolean checkedIn) {
    isCheckedIn = checkedIn;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getFlightId() {
    return flightId;
  }

  public void setFlightId(Long flightId) {
    this.flightId = flightId;
  }

  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }

  public String getPassenger() {
    return passenger;
  }

  public void setPassenger(String passenger) {
    this.passenger = passenger;
  }
}
