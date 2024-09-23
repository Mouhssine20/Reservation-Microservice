package net.mouhssine.reservationservice;

import net.mouhssine.reservationservice.entities.Reservation;
import net.mouhssine.reservationservice.repository.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class ReservationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReservationServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ReservationRepository reservationRepository) {
        return args -> {
            Reservation reservation = Reservation.builder()
                    .reservationId(null)
                    .reservationDate(new Date())
                    .reservationAddress("aaa-bbb-ccc")
                    .reservationName("XYZ")
                    .build();
            reservationRepository.save(reservation);


        };
    }
}
