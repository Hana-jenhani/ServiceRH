package com.service.RH.service;

import com.service.RH.model.Paie;

import java.util.List;

public interface IPaieService {

    List<Paie> findAllPaies();

    Paie addPaie(Paie p);

    Paie updatePaie(Paie p);

    Paie getPaieById(long Id);

    void deletePaieById(long Id);
}
