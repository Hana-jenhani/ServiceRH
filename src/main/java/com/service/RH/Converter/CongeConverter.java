package com.service.RH.Converter;

import com.service.RH.DTO.CongeDto;
import com.service.RH.model.Conge;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CongeConverter {
    public CongeDto entityToDto(Conge conge){
        CongeDto dto = new CongeDto();
        dto.setIdCong(conge.getIdCong());
        dto.setDescription(conge.getDescription());
        dto.setTypeCong(conge.getTypeCong());
        dto.setCreatedAt(conge.getCreatedAt());
        dto.setFinCong(conge.getFinCong());
        dto.setDuree(conge.getDuree());
        dto.setDebutCong(conge.getDebutCong());
        return dto;
    }
    public List<CongeDto> entityToDto(List<Conge> conges)
    {
        return conges.stream().map(this::entityToDto).collect(Collectors.toList());
    }
}
