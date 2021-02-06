package com.ss.utopia.tickets.mapper;

import com.ss.utopia.tickets.models.Ticket;
import com.ss.utopia.tickets.dto.CheckInDto;

public class CheckInDtoMap {

  public static Ticket map(CheckInDto checkInDto) {
    Ticket ticket = new Ticket();
    checkInDto.setCheckedIn(checkInDto.isCheckedIn());

    return ticket;
  }
}
