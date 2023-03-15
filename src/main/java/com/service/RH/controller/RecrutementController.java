package com.service.RH.controller;

import com.service.RH.Converter.RecrutementConverter;
import com.service.RH.DTO.RecrutementDto;
import com.service.RH.model.Recrutement;
import com.service.RH.service.RecrutementServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RecrutementController {
    @Autowired
    RecrutementServiceImp recrutementService;

    @Autowired
    private RecrutementConverter recrutementConverter;

    // http://localhost:8089/SpringMVC/retrieve-all-recrutement
    @GetMapping("/retrieve-all-recrutement")
    public List<RecrutementDto> list() {
        return recrutementConverter.entityToDto(recrutementService.findAllRecrutement());
    }

    //http://localhost:8089/SpringMVC/add-recrutement
    @PostMapping("/add-recrutement")
    public void add(@RequestBody Recrutement recrutement) {
        recrutementService.addRecrutement(recrutement);
    }
    // http://localhost:8089/SpringMVC/modify-recrutement


    @PutMapping("/modify-recrutement")
    @ResponseBody
    public Recrutement modifyrecrutement(@RequestBody Recrutement r) {
        return recrutementService.updateRecrutement(r);
    }


    // http://localhost:8089/SpringMVC/remove-recrutement/{recrutement-id}
    @DeleteMapping("/remove-recrutement/{recrutement-id}")
    @ResponseBody
    public void removeRecrutement(@PathVariable("recrutement-id") Long Id) {
        recrutementService.deleteRecrutementById(Id);
    }


    // http://localhost:8089/SpringMVC/retrieve-recrutement/3
    @GetMapping("/retrieve-recrutement/{recrutement-Id}")
    @ResponseBody
    public RecrutementDto retrieveRecrutement(@PathVariable("recrutement-Id") Long Id) {
        return recrutementConverter.entityToDto(recrutementService.getRecrutementById(Id));
    }
}
