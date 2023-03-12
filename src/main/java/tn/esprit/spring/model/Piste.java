package tn.esprit.spring.model;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
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
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;
    private String nomPiste;
    @Enumerated()
    private Couleur couleur;
    private int longeur;
    private int pente;

    @ManyToMany( mappedBy = "pistes")
    private Set<Skieur> skieurs;



}
