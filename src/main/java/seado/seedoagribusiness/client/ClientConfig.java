package seado.seedoagribusiness.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class ClientConfig {
    @Bean
    CommandLineRunner commandLineRunner(ClientRepository repository) {
        return args -> {
            Client shizo = new Client(
                    1L,
                    "Shizo",
                    "shizoseado510@gmail.com",
                    LocalDate.of(1998, Month.JULY, 23)
            );

            Client blackwood = new Client(
                    "Blackwood",
                    "blackwood@gmail.com",
                    LocalDate.of(1990, Month.JULY, 23)
            );

            Client teleza = new Client(
                    "Teleza",
                    "teleza@gmail.com",
                    LocalDate.of(1993, Month.JULY, 23)
            );

            repository.saveAll(
                    List.of(shizo, blackwood, teleza)
            );
        };
    }
}
