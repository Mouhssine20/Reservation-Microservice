package net.mouhssine.reservationservice.controller;

import net.mouhssine.reservationservice.entities.Reservation;
import net.mouhssine.reservationservice.repository.ReservationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservationController {
    private ReservationRepository reservationRepository;
    public ReservationController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @GetMapping("/reservations")
    public List<Reservation> reservationsList() {
        return reservationRepository.findAll();}

    @GetMapping("/reservations/{id}")
    public Reservation reservationById(@PathVariable Long id) {
        return reservationRepository.findById(id).get();


    }

}
