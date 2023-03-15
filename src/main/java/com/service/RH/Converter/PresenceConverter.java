package com.service.RH.Converter;

import com.service.RH.DTO.PresenceDto;
import com.service.RH.model.Presence;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PresenceConverter {

    public PresenceDto entityToDto(Presence presence){
        PresenceDto dto = new PresenceDto();
        dto.setId(presence.getId());
        dto.setNbrheures(presence.getNbrheures());
        dto.setDay(presence.getDay());
        return dto;
    }
    public List<PresenceDto> entityToDto(List<Presence> presences)
    {
        return presences.stream().map(this::entityToDto).collect(Collectors.toList());
    }

}
