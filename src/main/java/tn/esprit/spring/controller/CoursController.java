package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.model.Cours;
import tn.esprit.spring.service.ICoursService;

import java.util.List;

@RestController
@AllArgsConstructor
public class CoursController {

    @Autowired
    ICoursService iCoursService;

    @GetMapping("retrieveAllCours")
    public List<Cours> getAll() {
        return iCoursService.retrieveAllCours();

    }

    @GetMapping("retrieveCours/{numCours}")

    public Cours retrieveCours(@PathVariable Long numCours) {

        return iCoursService.retrieveCours(numCours);

    }

    @PostMapping("addCours")

    public Cours addCours(@RequestBody Cours cours) {

        return iCoursService.addCours(cours);
    }

    @DeleteMapping("deleteCours/{numCours}")
    public void removeCours(@PathVariable Long numCours) {

        iCoursService.deleteCours(numCours);
    }

    @PutMapping("updateCours")
    public Cours updateCours(@RequestBody Cours Cours) {

        return iCoursService.updateCours(Cours);

    }
}