package com.service.RH.service;

import com.service.RH.model.Presence;

import java.util.List;

public interface IPresenceService {

    List<Presence> findAllPrecences();

    Presence addPresence(Presence p);

    Presence getPresenceById(long Id);

    void deletePresenceById(long Id);

}
