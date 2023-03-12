package tn.esprit.spring.service;

import tn.esprit.spring.model.Cours;

import java.util.List;

public interface ICoursService {
    List<Cours> retrieveAllCours();
    Cours addCours(Cours cours);
    Cours updateCours (Cours cours);
    Cours retrieveCours (Long numCours);

    void deleteCours(Long numCours);
}
