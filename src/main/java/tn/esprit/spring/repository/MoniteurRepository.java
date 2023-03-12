package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.model.Moniteur;

@Repository

public interface MoniteurRepository extends JpaRepository<Moniteur, Long> {
}
