package com.service.RH.service;

import com.service.RH.model.Conge;

import java.util.List;

public interface ICongeService {
    List<Conge> findAllConge();

    Conge addConge(Conge c);

    Conge updateConge(Conge c);

    Conge getCongeById(long Id);

    void deleteCongeById(long Id);
}
