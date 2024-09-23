package net.mouhssine.ticketservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter @Setter @ToString
public class Reservation {
    private Long reservationId;
    private Date reservationDate;
    private String reservationName;
    private String reservationAddress;
}
