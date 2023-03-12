package tn.esprit.spring.service;

import tn.esprit.spring.model.Abonnement;

import java.util.List;

public interface IAbonnementService {
    List<Abonnement> retrieveAllAbonnement();
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement (Abonnement abonnement);
    Abonnement retrieveAbonnement (Long numAbon);
    void deleteAbonnement(Long numAbon);

}
