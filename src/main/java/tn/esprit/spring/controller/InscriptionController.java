package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.model.Inscription;
import tn.esprit.spring.service.IInscriptionService;

import java.util.List;

@RestController
@AllArgsConstructor
public class InscriptionController {
    @Autowired
    IInscriptionService iInscriptionService;
    @GetMapping("retrieveAllInscription")
    public List<Inscription> getAll(){
        return iInscriptionService.retrieveAllInscription();

    }
    @GetMapping("{numInscription}")

    public Inscription retrieveInscription(@PathVariable Long numInscription) {

        return  iInscriptionService.retrieveInscription(numInscription);

    }
    @PostMapping("addInscription")

    public Inscription addInscription(@RequestBody Inscription inscription){

        return iInscriptionService.addInscription(inscription);
    }
    @DeleteMapping("deleteInscription/{numInscription}")
    public void removeInscription(@PathVariable Long numInscription){

        iInscriptionService.deleteInscription(numInscription);
    }

    @PutMapping("updateInscription")
    public Inscription updateInscription(@RequestBody Inscription inscription) {

        return  iInscriptionService.updateInscription(inscription);

    }
}
