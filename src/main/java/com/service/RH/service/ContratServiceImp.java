package com.service.RH.service;

import com.service.RH.model.Contrat;
import com.service.RH.repository.ContratRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratServiceImp implements IContratService {

    @Autowired
    ContratRepository contratRepository;

    @Override
    public List<Contrat> findAllContrat() {
        List<Contrat> Contrats =  contratRepository.findAll();
        return Contrats;
    }

    @Override
    public Contrat addContrat(Contrat c) {
        return contratRepository.save(c);
    }

    @Override
    public Contrat getContratById(long Id) {
        return  contratRepository.findById(Id).get();
    }

    @Override
    public Contrat updateContrat(Contrat c) {
        return  contratRepository.save(c);
    }

    @Override
    public void deleteContratById(long Id) {
        this.contratRepository.deleteById(Id);
    }
}
