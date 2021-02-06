package com.ss.utopia.tickets;

import com.ss.utopia.tickets.controller.TicketsController;
import com.ss.utopia.tickets.dto.TicketsDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = TicketsApplication.class)

class TicketsApplicationTests {

	@Autowired
	private TicketsController ticketsController;

	@Test
	public void testCreateTicket() {
		TicketsDto ticketsDto = new TicketsDto();
		ticketsDto.setFlightId(240L);
		ticketsDto.setCustomerId(101L);
		ticketsDto.setPassenger("Jon Doe");
		ticketsDto.setCheckedIn(false);
	}

}
