package tn.esprit.spring.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;

enum TypeAbonnement{
    ANNUEL,SEMESTRIEL,MENSUEL
}


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Slf4j
public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numAbon;
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    private float prixAbon;
    @Enumerated()
    private TypeAbonnement typeAbon;
    @OneToOne(cascade = CascadeType.REMOVE, mappedBy = "abonnement")
    private Skieur skieur;


}
