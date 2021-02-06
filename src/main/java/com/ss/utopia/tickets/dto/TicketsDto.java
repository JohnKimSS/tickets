package com.ss.utopia.tickets.dto;

import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TicketsDto {

  @NotBlank(message = "Flight Number is required")
  private Long flightId;

  @NotBlank(message = "Customer ID is required")
  private Long customerId;

  @NotBlank(message = "Passenger name is required")
  private String passenger;

  private boolean isCheckedIn = false;

}
