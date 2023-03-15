package com.service.RH.service;

import com.service.RH.model.Conge;
import com.service.RH.repository.CongeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CongeServiceImpl implements ICongeService {

    private int d=0;
    @Autowired
    CongeRepository congeRepository;


    @Override
    public List<Conge> findAllConge() {
        List<Conge> Conges =  congeRepository.findAll();
        return Conges;
    }

    @Override
    public Conge addConge(Conge c) {
        return congeRepository.save(c);
    }

    @Override
    public Conge updateConge(Conge c) {
        return congeRepository.save(c);
    }

    @Override
    public Conge getCongeById(long Id) {
        return  congeRepository.findById(Id).get();
    }

    @Override
    public void deleteCongeById(long Id) {
        this.congeRepository.deleteById(Id);
    }
}
