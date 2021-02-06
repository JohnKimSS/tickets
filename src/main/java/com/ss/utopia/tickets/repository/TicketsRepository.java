package com.ss.utopia.tickets.repository;

import com.ss.utopia.tickets.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketsRepository extends JpaRepository<Ticket, Long> {

}
