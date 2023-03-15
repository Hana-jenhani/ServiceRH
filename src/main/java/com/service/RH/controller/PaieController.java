package com.service.RH.controller;

import com.service.RH.Converter.PaieConverter;
import com.service.RH.DTO.PaieDto;
import com.service.RH.model.Paie;
import com.service.RH.service.PaieServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PaieController {
    @Autowired
    PaieServiceImp paieService;

    @Autowired
    private PaieConverter paieConverter;

    // http://localhost:8089/SpringMVC/retrieve-all-paie
    @GetMapping("/retrieve-all-paie")
    public List<Paie> list() {
        return paieService.findAllPaies();
    }

    //http://localhost:8089/SpringMVC/add-paie
    @PostMapping("/add-paie")
    public void add(@RequestBody Paie paie) {
        paieService.addPaie(paie);
    }

    // http://localhost:8089/SpringMVC/retrieve-paie/3
    @GetMapping("/retrieve-paie/{paie-Id}")
    @ResponseBody
    public PaieDto retrievepaie(@PathVariable("paie-Id") Long Id) {

        return paieConverter.entityToDto(paieService.getPaieById(Id));
    }

    // http://localhost:8089/SpringMVC/remove-paie/{paie-id}
    @DeleteMapping("/remove-paie/{paie-id}")
    @ResponseBody
    public void removePaie(@PathVariable("paie-id") Long Id) {
        paieService.deletePaieById(Id);
    }

    // http://localhost:8089/SpringMVC/modify-paie
    @PutMapping("/modify-paie")
    @ResponseBody
    public Paie modifypaie(@RequestBody Paie p) {
        return paieService.updatePaie(p);
    }


}
