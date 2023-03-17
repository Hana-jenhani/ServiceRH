package com.service.RH.service;

import com.service.RH.model.Candidat;
import com.service.RH.repository.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatServiceImp implements ICandidatService{
    @Autowired
    CandidatRepository candidatRepository;

    @Override
    public List<Candidat> findAllCandidat() {
        List<Candidat> Candidats =  candidatRepository.findAll();
        return Candidats;
    }

    @Override
    public Candidat addCandidat(Candidat c) {
        return candidatRepository.save(c);
    }

    @Override
    public Candidat updateCandidat(Candidat c) {
        return candidatRepository.save(c);
    }

    @Override
    public Candidat getCandidatById(long Id) {
        return  candidatRepository.findById(Id).get();
    }

    @Override
    public void deleteCandidatById(long Id) {
        this.candidatRepository.deleteById(Id);
    }
}
