package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.model.Moniteur;
import tn.esprit.spring.service.IMoniteurService;

import java.util.List;

@RestController
@AllArgsConstructor
public class MoniteurController {
    @Autowired
    IMoniteurService iMoniteurService;
    @GetMapping("retrieveAllMoniteurs")
    public List<Moniteur> getAll(){
        return iMoniteurService.retrieveAllMoniteurs();

    }
    @GetMapping("retrieveMoniteur/{numMoniteur}")

    public Moniteur retrieveMoniteur(@PathVariable Long numMoniteur) {

        return  iMoniteurService.retrieveMoniteur(numMoniteur);

    }
    @PostMapping("addMoniteur")

    public Moniteur addMoniteur(@RequestBody Moniteur moniteur){

        return iMoniteurService.addMoniteur(moniteur);
    }
    @DeleteMapping("deleteMoniteur/{numMoniteur}")
    public void removeMoniteur(@PathVariable Long numMoniteur){

        iMoniteurService.deleteMoniteur(numMoniteur);
    }

    @PutMapping("updateMoniteur")
    public Moniteur updateMoniteur(@RequestBody Moniteur Moniteur) {

        return  iMoniteurService.updateMoniteur(Moniteur);

    }
}
