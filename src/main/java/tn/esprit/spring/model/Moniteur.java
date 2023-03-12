package tn.esprit.spring.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Slf4j
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    @Temporal(TemporalType.DATE)
    private Date dateRecru;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Cours> cours;
}
