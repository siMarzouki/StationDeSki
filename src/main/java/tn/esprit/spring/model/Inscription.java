package tn.esprit.spring.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Slf4j
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInscription;
    private int numSemaine;

    @ManyToOne(cascade = CascadeType.ALL)
    private Skieur skieur;

    @ManyToOne(cascade = CascadeType.ALL)
    private Cours cours;

}
