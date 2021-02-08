package com.ss.utopia.tickets.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.ss.utopia.tickets.dto.TicketsDto;
import com.ss.utopia.tickets.mapper.TicketsDtoMap;
import com.ss.utopia.tickets.models.Ticket;
import com.ss.utopia.tickets.repository.TicketsRepository;
import java.io.IOException;
import java.util.List;
import org.apache.catalina.connector.ClientAbortException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

@Profile("test")
@SpringBootTest(classes = TicketsController.class)
public class TicketsControllerTest {

  @Autowired
  private TicketsController controller;

  @Autowired
  private TicketsRepository repo;

//  // Valid Ticket
//  TicketsDto ticketsDto = new TicketsDto();
//  TicketsDtoMap ticketsDtoMap = new TicketsDtoMap();
//  Ticket ticket = ticketsDtoMap.map(ticketsDto);
//    ticket.setFlightId(120L);
//    ticket.setCustomerId(240L);
//    ticket.setPassenger("John Kim");
//    ticket.setCheckedIn(false);
//
//  @Test
//  void testGetAll200() throws ClientAbortException, IOException {
//    List<Ticket> res = (List<Ticket>) controller.getAllTickets();
//
//    assertEquals(200, res.getStatusCode());
//  }

}
