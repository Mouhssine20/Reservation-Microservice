package net.mouhssine.ticketservice.repository;

import net.mouhssine.ticketservice.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, String> {
}
