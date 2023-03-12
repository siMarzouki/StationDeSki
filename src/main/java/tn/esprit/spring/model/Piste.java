package tn.esprit.spring.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Set;

enum Couleur {
    VERT,
    BLEU,
    ROUGE,
    NOIR

}
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Slf4j
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;
    private String nomPiste;
    @Enumerated()
    private Couleur couleur;
    private int longeur;
    private int pente;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "pistes")
    private Set<Skieur> skieurs;



}
