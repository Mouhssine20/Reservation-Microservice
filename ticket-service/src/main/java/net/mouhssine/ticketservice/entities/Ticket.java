package net.mouhssine.ticketservice.entities;

import jakarta.persistence.*;
import lombok.*;
import net.mouhssine.ticketservice.model.Reservation;

@Entity
@Setter @Getter @ToString @AllArgsConstructor @NoArgsConstructor @Builder

public class Ticket {
    @Id
    private String ticketId;
    private String ticketTitle;
    private String ticketDescription;
    @Transient
    private Reservation reservation;
    private Long reservationId;

}
