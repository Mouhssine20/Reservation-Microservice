package net.mouhssine.ticketservice.Client;

import net.mouhssine.ticketservice.model.Reservation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "RESERVATION-SERVICE")
public interface ReservationRest {
    @GetMapping("/reservations/{id}")
    Reservation findReservationById(@PathVariable Long id);
    @GetMapping("/reservations")
    List<Reservation> allReservations();


}
