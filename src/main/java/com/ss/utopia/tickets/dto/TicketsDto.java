package com.ss.utopia.tickets.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TicketsDto {

  @NotNull
  private Long flightId;

  @NotNull
  private Long customerId;

  @NotBlank(message = "Passenger name is required")
  private String passenger;

  @NotNull
  private boolean isCheckedIn;

}
