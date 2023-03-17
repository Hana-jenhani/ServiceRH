package com.service.RH.Converter;

import com.service.RH.DTO.CandidatDto;
import com.service.RH.model.Candidat;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CandidatConverter {
    public CandidatDto entityToDto(Candidat candidat){
        CandidatDto dto = new CandidatDto();
        dto.setIdCand(candidat.getIdCand());
        dto.setNom(candidat.getNom());
        dto.setPrenom(candidat.getPrenom());
        dto.setEmail(candidat.getEmail());
        dto.setAdresse(candidat.getAdresse());
        dto.setCin(candidat.getCin());
        dto.setDatenaissance(candidat.getDatenaissance());
        dto.setNationalite(candidat.getNationalite());
        dto.setNiveauEtude(candidat.getNiveauEtude());
        dto.setPathCv(candidat.getPathCv());
        dto.setTel(candidat.getTel());
        dto.setPathMotivationLetter(candidat.getPathMotivationLetter());
        dto.setTitreDiplome(candidat.getTitreDiplome());
        dto.setVille(candidat.getVille());
        dto.setUniversite(candidat.getUniversite());
        dto.setNiveauExp(candidat.getNiveauExp());
        return dto;
    }
    public List<CandidatDto> entityToDto(List<Candidat> candidats)
    {
        return candidats.stream().map(this::entityToDto).collect(Collectors.toList());
    }
}
