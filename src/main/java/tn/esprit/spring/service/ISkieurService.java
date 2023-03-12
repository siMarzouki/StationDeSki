package tn.esprit.spring.service;

import tn.esprit.spring.model.Skieur;

import java.util.List;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);
    Skieur retrieveSkieur (Long numSkieur);
    Skieur updateSkieur (Skieur Skieur);

    void deleteSkieur (Long numSkieur);
}
