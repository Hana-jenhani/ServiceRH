package com.service.RH.service;

import com.service.RH.model.Paie;
import com.service.RH.repository.PaieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaieServiceImp  implements IPaieService {
    @Autowired
    private PaieRepository paieRepository;

    @Override
    public List<Paie> findAllPaies() {
        List<Paie> Paies =  paieRepository.findAll();
        return Paies;
    }

    @Override
    public Paie addPaie(Paie p) {
        return paieRepository.save(p);
    }

    @Override
    public Paie updatePaie(Paie p) {
        return paieRepository.save(p);
    }

    @Override
    public Paie getPaieById(long Id) {
        return  paieRepository.findById(Id).get();
    }

    @Override
    public void deletePaieById(long Id) {
        this.paieRepository.deleteById(Id);
    }
}
