package com.service.RH.controller;

import com.service.RH.Converter.CongeConverter;
import com.service.RH.DTO.CongeDto;
import com.service.RH.model.Conge;
import com.service.RH.service.CongeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CongeController {
    @Autowired
    CongeServiceImpl congeService;

    @Autowired
    private CongeConverter congeConverter;

    // http://localhost:8089/SpringMVC/retrieve-all-conge

    @GetMapping("/retrieve-all-conge")
    public List<Conge> list() {
        return congeService.findAllConge();
    }

    //http://localhost:8089/SpringMVC/add-conge

    @PostMapping("/add-conge")
    public void add(@RequestBody Conge conge) {

        congeService.addConge(conge);
    }

    // http://localhost:8089/SpringMVC/retrieve-conge/3
    @GetMapping("/retrieve-conge/{conge-Id}")
    @ResponseBody
    public CongeDto retrieveConge(@PathVariable("conge-Id") Long Id) {
        return congeConverter.entityToDto(congeService.getCongeById(Id));
    }


    // http://localhost:8089/SpringMVC/remove-conge/{conge-id}
    @DeleteMapping("/remove-conge/{conge-id}")
    @ResponseBody
    public void removeConge(@PathVariable("conge-id") Long Id) {
        congeService.deleteCongeById(Id);
    }



    // http://localhost:8089/SpringMVC/modify-conge
    @PutMapping("/modify-conge")
    @ResponseBody
    public Conge modifyconge(@RequestBody Conge c) {
        return congeService.updateConge(c);
    }

}
