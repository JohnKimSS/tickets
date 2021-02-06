package com.ss.utopia.tickets.service;

import com.ss.utopia.tickets.models.Ticket;
import com.ss.utopia.tickets.repository.TicketsRepository;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketsService {

  @Autowired
  private TicketsRepository ticketsRepository;

  public Ticket createTicket(Ticket ticket) {
    ticketsRepository.save(ticket);
    return ticket;
  }

  public Optional<Ticket> getTicketById(Long id) {
    return ticketsRepository.findById(id);
  }

  public List<Ticket> getAllTickets() {
    return ticketsRepository.findAll();
  }

  public Ticket checkIn(Ticket ticket) {
    Long id = ticket.getId();
        System.out.println("Servicing ticket ID: " + id);
    if (id == null || id < 1) {
      throw new IllegalArgumentException("ID entered is not valid.");
    }
    if(ticketsRepository.findById(id).isEmpty()){
      throw new NoSuchElementException("No ticket with ID "+ id + " exists.");
    }
    Ticket checkedTicket = ticketsRepository.findById(id).get();
    checkedTicket.setCheckedIn(true);
        System.out.println("Ticket to be written to DB: " + checkedTicket);
    return ticketsRepository.save(checkedTicket);
  }

}
