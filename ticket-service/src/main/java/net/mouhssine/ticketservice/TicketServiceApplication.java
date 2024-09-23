package net.mouhssine.ticketservice;

import net.mouhssine.ticketservice.entities.Ticket;
import net.mouhssine.ticketservice.repository.TicketRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
@EnableFeignClients
public class TicketServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(TicketRepository ticketRepository) {
        return args -> {
            Ticket ticket = Ticket.builder()
                    .ticketId(UUID.randomUUID().toString())
                    .ticketTitle("Hello there")
                    .ticketDescription("hello")
                    .reservationId(Long.valueOf(1))
                    .build();
            ticketRepository.save(ticket);


        };
    }
}
