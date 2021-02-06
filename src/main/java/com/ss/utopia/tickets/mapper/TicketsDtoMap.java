package com.ss.utopia.tickets.mapper;

import com.ss.utopia.tickets.dto.TicketsDto;
import com.ss.utopia.tickets.models.Ticket;

public class TicketsDtoMap {

  public static Ticket map(TicketsDto ticketsDto) {
    Ticket ticket = new Ticket();
    ticket.setFlightId(ticketsDto.getFlightId());
    ticket.setCustomerId(ticketsDto.getCustomerId());
    ticket.setPassenger(ticketsDto.getPassenger());
    ticket.setCheckedIn(ticketsDto.isCheckedIn());

    return ticket;
  }

}
