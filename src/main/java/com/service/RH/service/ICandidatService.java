package com.service.RH.service;

import com.service.RH.model.Candidat;

import java.util.List;

public interface ICandidatService {
    List<Candidat> findAllCandidat();

    Candidat addCandidat(Candidat c);

    Candidat updateCandidat(Candidat c);

    Candidat getCandidatById(long Id);

    void deleteCandidatById(long Id);
}
