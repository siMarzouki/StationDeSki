package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.model.Piste;
import tn.esprit.spring.service.IPisteService;

import java.util.List;

@RestController
@AllArgsConstructor
public class PisteController {
    @Autowired
    IPisteService iPisteService;
    @GetMapping("retrieveAllPistes")
    public List<Piste> getAll(){
        return iPisteService.retrieveAllPistes();

    }

    @GetMapping("retrievePiste/{numPiste}")

    public Piste retrievePiste(@PathVariable Long numPiste) {

        return  iPisteService.retrievePiste(numPiste);

    }
    @PostMapping("addPiste")

    public Piste addPiste(@RequestBody Piste piste){

        return iPisteService.addPiste(piste);
    }

    @DeleteMapping("deletePiste/{numpiste}")
    public void removePiste(@PathVariable Long numpiste){

        iPisteService.deletePiste(numpiste);
    }
    @PutMapping("updatePiste")
    public Piste updatePiste(@RequestBody Piste Piste) {

        return  iPisteService.updatePiste(Piste);

    }
}
