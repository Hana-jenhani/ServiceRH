package com.service.RH.Converter;

import com.service.RH.DTO.UserInformationDto;
import com.service.RH.model.UserInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserInformationConverter {
    @Autowired
    private RecrutementConverter recrutementConverter;
    public UserInformationDto entityToDto(UserInformation userInformation){
        UserInformationDto dto = new UserInformationDto();
        dto.setIdUser(userInformation.getIdUser());
        dto.setCIN(userInformation.getCIN());
        dto.setDatenaissance(userInformation.getDatenaissance());
        dto.setEmail(userInformation.getEmail());
        dto.setLogin(userInformation.getLogin());
        dto.setNom(userInformation.getNom());
        dto.setPrenom(userInformation.getPrenom());
        dto.setRecrutementDtos(recrutementConverter.entityToDto(userInformation.getRecrutements()));
        return dto;
    }

    public List<UserInformationDto> entityToDto(List<UserInformation> userInformations)
    {
        return userInformations.stream().map(this::entityToDto).collect(Collectors.toList());
    }

}
