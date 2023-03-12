package tn.esprit.spring.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
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
    private long numCours;

    private int niveau;

    private float prix;
    private int creneau;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;
    @Enumerated(EnumType.ORDINAL)

    private Support support;
    @OneToMany(mappedBy = "cours")
    private Set<Inscription> inscriptions;

}
