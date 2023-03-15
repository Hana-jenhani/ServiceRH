package com.service.RH.Converter;

import com.service.RH.DTO.ContratDto;
import com.service.RH.model.Contrat;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ContratConverter {


    public ContratDto entityToDto(Contrat contrat){
        ContratDto dto = new ContratDto();
        dto.setDatedebut(contrat.getDatedebut());
        dto.setDuree(contrat.getDuree());
        dto.setPoste(contrat.getPoste());
        dto.setTypecontrat(contrat.getTypecontrat());
        return dto;
    }

    public List<ContratDto> entityToDto(List<Contrat> contrats)
    {
        return contrats.stream().map(this::entityToDto).collect(Collectors.toList());
    }

}
