package com.service.RH.service;

import com.service.RH.model.Contrat;

import java.util.List;

public interface IContratService {
    List<Contrat> findAllContrat();

    Contrat addContrat(Contrat c);


    Contrat getContratById(long Id);

    Contrat updateContrat(Contrat c);

    void deleteContratById(long Id);
}
