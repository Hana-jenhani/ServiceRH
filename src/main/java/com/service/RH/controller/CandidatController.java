package com.service.RH.controller;

import com.service.RH.Converter.CandidatConverter;
import com.service.RH.DTO.CandidatDto;
import com.service.RH.model.Candidat;
import com.service.RH.service.CandidatServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CandidatController {
    @Autowired
    CandidatServiceImp candidatService;

    @Autowired
    private CandidatConverter candidatConverter;

    // http://localhost:8089/SpringMVC/retrieve-all-candidat
    @GetMapping("/retrieve-all-candidat")
    public List<CandidatDto> list() {
        return candidatConverter.entityToDto(candidatService.findAllCandidat());
    }

    //http://localhost:8089/SpringMVC/add-candidat
    @PostMapping("/add-candidat")
    public void add(@RequestBody Candidat candidat) {
        candidatService.addCandidat(candidat);
    }


    // http://localhost:8089/SpringMVC/retrieve-candidat/3
    @GetMapping("/retrieve-candidat/{candidat-Id}")
    @ResponseBody
    public CandidatDto retrieveCandidat(@PathVariable("candidat-Id") Long Id) {
        return candidatConverter.entityToDto(candidatService.getCandidatById(Id));
    }

    // http://localhost:8089/SpringMVC/remove-candidat/{candidat-id}
    @DeleteMapping("/remove-candidat/{candidat-id}")
    @ResponseBody
    public void removeCandidat(@PathVariable("candidat-id") Long Id) {
        candidatService.deleteCandidatById(Id);
    }

    // http://localhost:8089/SpringMVC/modify-candidat
    @PutMapping("/modify-candidat")
    @ResponseBody
    public Candidat modifycandidat(@RequestBody Candidat c) {
        return candidatService.updateCandidat(c);
    }

}
