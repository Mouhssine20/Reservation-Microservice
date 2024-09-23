package net.mouhssine.reservationservice.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Setter @Getter @AllArgsConstructor @NoArgsConstructor @Builder

public class Reservation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;
    private Date reservationDate;
    private String reservationName;
    private String reservationAddress;
}
