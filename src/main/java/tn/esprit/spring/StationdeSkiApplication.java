package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tn.esprit.spring.model.Abonnement;
import tn.esprit.spring.repository.AbonnementRepository;

import java.util.Optional;

@SpringBootApplication
public class StationdeSkiApplication {

    public static void main(String[] args) {
        SpringApplication.run(StationdeSkiApplication.class, args);


    }

}
