package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.model.Abonnement;

@Repository
public interface  AbonnementRepository extends JpaRepository<Abonnement,Long> {}