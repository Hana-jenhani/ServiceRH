package com.service.RH.service;

import com.service.RH.model.Recrutement;

import java.util.List;

public interface IRecrutementService {
    List<Recrutement> findAllRecrutement();

    Recrutement addRecrutement(Recrutement r);

    Recrutement updateRecrutement(Recrutement r);

    Recrutement getRecrutementById(long Id);
    void deleteRecrutementById(long Id);
}
