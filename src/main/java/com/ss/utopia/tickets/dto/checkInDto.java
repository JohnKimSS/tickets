package com.ss.utopia.tickets.dto;

import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CheckInDto {
  @NotBlank(message = "Ticket ID is required")
  private long id;

  private boolean checkedIn;

}
