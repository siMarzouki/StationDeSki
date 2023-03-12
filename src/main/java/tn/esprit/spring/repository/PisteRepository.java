package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.model.Piste;

@Repository

public interface PisteRepository extends JpaRepository<Piste, Long> {
//    @Query("select Cours from  Cours,Inscription ,Skieur ,Piste " +
//            "where Cours.inscriptions i " )
}
