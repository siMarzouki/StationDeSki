package tn.esprit.spring.service;

import tn.esprit.spring.model.Piste;

import java.util.List;

public interface IPisteService {
    List<Piste> retrieveAllPistes();
    Piste addPiste(Piste piste);
    Piste updatePiste (Piste piste);
    Piste  retrievePiste (Long numPiste);
    void deletePiste(Long numPiste);
}
