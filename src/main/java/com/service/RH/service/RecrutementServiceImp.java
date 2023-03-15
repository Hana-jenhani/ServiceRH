package com.service.RH.service;

import com.service.RH.model.Recrutement;
import com.service.RH.repository.RecrutementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecrutementServiceImp implements IRecrutementService{
    @Autowired
    private RecrutementRepository recrutementRepository;

    @Override
    public List<Recrutement> findAllRecrutement() {
        List<Recrutement> Recrutements =  recrutementRepository.findAll();
        return Recrutements ;
    }

    @Override
    public Recrutement addRecrutement(Recrutement r) {
        return recrutementRepository.save(r);
    }

    @Override
    public Recrutement updateRecrutement(Recrutement r) {
        return recrutementRepository.save(r);
    }

    @Override
    public Recrutement getRecrutementById(long Id) {
        return  recrutementRepository.findById(Id).get();
    }

    @Override
    public void deleteRecrutementById(long Id) {
        this.recrutementRepository.deleteById(Id);
    }
}
