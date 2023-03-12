package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.model.Skieur;
import tn.esprit.spring.service.ISkieurService;

import java.util.List;

@RestController
@AllArgsConstructor
public class SkieurController {
    @Autowired
    ISkieurService iSkieurService;

    @GetMapping("retrieveAllSkieurs")
    public List<Skieur> getAll() {
        return iSkieurService.retrieveAllSkieurs();

    }

    @GetMapping("retrieveSkieur/{numSkieur}")

    public Skieur retrieveSkieur(@PathVariable Long numSkieur) {

        return iSkieurService.retrieveSkieur(numSkieur);

    }

    @PostMapping("addSkieur")

    public Skieur addSkieur(@RequestBody Skieur skieur) {

        return iSkieurService.addSkieur(skieur);
    }

    @DeleteMapping("deleteSkieur/{numSkieur}")
    public void removeSkieur(@PathVariable Long numSkieur) {

        iSkieurService.deleteSkieur(numSkieur);
    }

    @PutMapping("updateSkieur")
    public Skieur updateSkieur(@RequestBody Skieur Skieur) {

        return iSkieurService.updateSkieur(Skieur);

    }
}
