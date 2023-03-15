package com.service.RH.Converter;

import com.service.RH.DTO.PaieDto;
import com.service.RH.model.Paie;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PaieConverter {
    public PaieDto entityToDto(Paie paie){
        PaieDto dto = new PaieDto();
        dto.setIdpaie(paie.getIdpaie());
        dto.setAnnée(paie.getAnnée());
        dto.setDate(paie.getDate());
        dto.setMois(paie.getMois());
        return dto;
    }
    public List<PaieDto> entityToDto(List<Paie> paies)
    {
        return paies.stream().map(this::entityToDto).collect(Collectors.toList());
    }
}
