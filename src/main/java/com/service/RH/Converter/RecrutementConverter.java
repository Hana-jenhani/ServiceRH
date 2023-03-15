package com.service.RH.Converter;

import com.service.RH.DTO.RecrutementDto;
import com.service.RH.model.Recrutement;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RecrutementConverter {
    public RecrutementDto entityToDto(Recrutement recrutement){
        RecrutementDto dto = new RecrutementDto();
        dto.setIdrec(recrutement.getIdrec());
        dto.setDescription(recrutement.getDescription());
        dto.setNombrepersonne(recrutement.getNombrepersonne());
        dto.setPoste(recrutement.getPoste());
        dto.setSpecialite(recrutement.getSpecialite());
        return dto;
    }

    public List<RecrutementDto> entityToDto(List<Recrutement> recrutements)
    {
        return recrutements.stream().map(this::entityToDto).collect(Collectors.toList());
    }

}
