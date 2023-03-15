package com.service.RH.service;

import com.service.RH.model.Presence;
import com.service.RH.repository.PresenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PresenceServiceImp implements IPresenceService{
    @Autowired
    private PresenceRepository presenceRepository;

    @Override
    public List<Presence> findAllPrecences() {
        List<Presence> Presences =  presenceRepository.findAll();
        return Presences;
    }

    @Override
    public Presence addPresence(Presence p) {
        return presenceRepository.save(p);
    }

    @Override
    public Presence getPresenceById(long Id) {
        return  presenceRepository.findById(Id).get();
    }

    @Override
    public void deletePresenceById(long Id) {
        this.presenceRepository.deleteById(Id);
    }
}
