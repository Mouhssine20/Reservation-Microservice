package net.mouhssine.ticketservice.controller;

import net.mouhssine.ticketservice.Client.ReservationRest;
import net.mouhssine.ticketservice.entities.Ticket;
import net.mouhssine.ticketservice.model.Reservation;
import net.mouhssine.ticketservice.repository.TicketRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class TicketController {
    private ReservationRest reservationRest;
    private TicketRepository ticketRepository;

    public TicketController(ReservationRest reservationRest, TicketRepository ticketRepository) {
        this.reservationRest = reservationRest;
        this.ticketRepository = ticketRepository;
    }

    @GetMapping("/tickets")
    public List<Ticket> ticketList() {
        return ticketRepository.findAll();
    }

   @GetMapping("/tickets/{id}")
    public Ticket ticketById(@PathVariable String id) {
        Ticket ticket = ticketRepository.findById(id).get();
        Reservation reservation = reservationRest.findReservationById(ticket.getReservationId());
        ticket.setReservation(reservation);
        return ticket;
    }



}
