package com.ss.utopia.tickets.dto;

import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CheckInDto {

  @NotNull
  private long id;
  @NotNull
  private boolean checkedIn;

}
