package tn.esprit.spring.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Set;

enum Support{
    SKI, SNOWBOARD
}
enum TypeCours{
    COLLECTIF_ENFANT,COLLECTIF_ADULTE,PARTICULIER
}
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Slf4j
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCours;
    private int niveau;
    @Enumerated()
    private TypeCours typeCours;
    @Enumerated()
    private  Support support;
    private float prix;
    private int creneau;
    @OneToMany(mappedBy = "cours")
    private Set<Inscription> inscriptions;

}
