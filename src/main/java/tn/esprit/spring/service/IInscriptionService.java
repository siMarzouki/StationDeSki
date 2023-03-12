package tn.esprit.spring.service;

import tn.esprit.spring.model.Inscription;

import java.util.List;

public interface IInscriptionService {
    List<Inscription> retrieveAllInscription();
    Inscription addInscription(Inscription inscription);
    Inscription updateInscription(Inscription inscription);
    Inscription retrieveInscription(Long numInscription);

    void deleteInscription(Long numInscription);
}
