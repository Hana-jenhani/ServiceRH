package com.service.RH.controller;

import com.service.RH.model.Contrat;
import com.service.RH.service.ContratServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ContratController {
    @Autowired
    ContratServiceImp contratService;

    // http://localhost:8089/SpringMVC/retrieve-all-contrat
    @GetMapping("/retrieve-all-contrat")
    public List<Contrat> list() {
        return contratService.findAllContrat();
    }



    //http://localhost:8089/SpringMVC/add-contrat
    @PostMapping("/add-contrat")
    public void add(@RequestBody Contrat contrat) {
        contratService.addContrat(contrat);
    }
}
