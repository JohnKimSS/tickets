package com.ss.utopia.tickets.service;

import com.ss.utopia.tickets.models.Ticket;
import com.ss.utopia.tickets.repository.TicketsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

//@Profile("test")
//@SpringBootTest(classes = TicketsService.class)
//public class TicketsServiceTest {
//
//  @Autowired
//  private TicketsRepository repo;
//
//  @Test
//  void testCreateTicket() {
//    Ticket ticket = new Ticket();
//    ticket.setFlightId(120L);
//    ticket.setCustomerId(240L);
//    ticket.setPassenger("John Kim");
//    ticket.setCheckedIn(false);
//
//    repo.save(ticket);
//  }
//
//}
