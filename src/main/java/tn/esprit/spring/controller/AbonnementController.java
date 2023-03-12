package tn.esprit.spring.controller;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.model.Abonnement;
import tn.esprit.spring.service.IAbonnementService;

import java.util.List;

@RestController
@AllArgsConstructor
public class AbonnementController {
    @Autowired
    IAbonnementService iAbonnementService;

    @GetMapping("retrieveAllAbonnement")
    public List<Abonnement> getAll() {
        return iAbonnementService.retrieveAllAbonnement();

    }

    @GetMapping("retrieveAbonnement/{numAbon}")

    public Abonnement retrieveAbonnement(@PathVariable Long numAbon) {

        return iAbonnementService.retrieveAbonnement(numAbon);

    }

    @PostMapping("addAbonnement")

    public Abonnement addAbonnement(@RequestBody Abonnement abonnement) {

        return iAbonnementService.addAbonnement(abonnement);
    }

    @DeleteMapping("removeAbonnement/{numAbon}")
    public void removeAbonnement(@PathVariable Long numAbon) {

        iAbonnementService.deleteAbonnement(numAbon);
    }

    @PutMapping("updateAbonnement")
    public Abonnement updateAbonnement(@RequestBody Abonnement abonnement) {

        return iAbonnementService.updateAbonnement(abonnement);

    }
}