package com.ss.utopia.tickets.controller;

import com.ss.utopia.tickets.dto.TicketsDto;
import com.ss.utopia.tickets.dto.CheckInDto;
import com.ss.utopia.tickets.mapper.CheckInDtoMap;
import com.ss.utopia.tickets.mapper.TicketsDtoMap;
import com.ss.utopia.tickets.models.Ticket;
import com.ss.utopia.tickets.service.TicketsService;
import java.util.List;
import java.util.NoSuchElementException;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tickets")
public class TicketsController {

  @Autowired
  private TicketsService ticketsService;

  @GetMapping
  public ResponseEntity<List<Ticket>> getAllTickets() {
    List<Ticket> tickets = ticketsService.getAllTickets();
    if(tickets.isEmpty()) {
      return ResponseEntity.noContent().build();
    }
    return ResponseEntity.ok(tickets);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Ticket> getTicketById(@PathVariable Long id) {
    return ResponseEntity.of(ticketsService.getTicketById(id));
  }

  @PostMapping
  public ResponseEntity<Ticket> createTicket(@Valid @RequestBody TicketsDto ticketDto) {
    TicketsDtoMap ticketsDtoMap = new TicketsDtoMap();
    Ticket ticket = ticketsDtoMap.map(ticketDto);
    Ticket newTicket = ticketsService.createTicket(ticket);
    return ResponseEntity.status(201).body(newTicket);
  }

  @PutMapping("/{id}")
    public ResponseEntity<?> checkIn(@PathVariable Long id, @Valid @RequestBody CheckInDto ticketDto) {
    CheckInDto checkInDto = new CheckInDto();
    CheckInDtoMap checkInDtoMap = new CheckInDtoMap();
    if(id == null) {
      return ResponseEntity.badRequest().body("Ticket ID is required to check-in");
    }

    Ticket ticketCheckingIn = checkInDtoMap.map(checkInDto);
    ticketCheckingIn.setId(id);
    ticketCheckingIn.setCheckedIn(true);

    try {
      Ticket checkedInTicket = ticketsService.checkIn(ticketCheckingIn);
      return ResponseEntity.ok(checkedInTicket);
    } catch(NoSuchElementException err) {
      err.printStackTrace();
      return ResponseEntity.notFound().build();
    }

  }


}
