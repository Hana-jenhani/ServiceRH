package com.service.RH.controller;

import com.service.RH.Converter.PresenceConverter;
import com.service.RH.DTO.PresenceDto;
import com.service.RH.model.Presence;
import com.service.RH.service.PresenceServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PresenceController {
    @Autowired
    PresenceServiceImp presenceService;

    @Autowired
    private PresenceConverter presenceConverter;

    // http://localhost:8089/SpringMVC/retrieve-all-presence
    @GetMapping("/retrieve-all-presence")
    public List<Presence> list() {
        return presenceService.findAllPrecences();
    }

    //http://localhost:8089/SpringMVC/add-presence
    @PostMapping("/add-presence")
    public void add(@RequestBody Presence presence) {
        presenceService.addPresence(presence);
    }

    // http://localhost:8089/SpringMVC/presence-user/{presence-id}
    @DeleteMapping("/remove-presence/{presence-id}")
    @ResponseBody
    public void removeUser(@PathVariable("presence-id") Long Id) {
        presenceService.deletePresenceById(Id);
    }

    // http://localhost:8089/SpringMVC/retrieve-presence/3
    @GetMapping("/retrieve-presence/{presence-Id}")
    @ResponseBody
    public PresenceDto retrievePresence(@PathVariable("presence-Id") Long Id) {
        return presenceConverter.entityToDto(presenceService.getPresenceById(Id));
    }


}
