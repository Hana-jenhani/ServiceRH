package com.service.RH.DTO;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class UserInformationDto {
    private Long idUser;
    private String nom;
    private String prenom;
    private String login;
    private String status;
    private String email;
    private String CIN;
    private Date datenaissance;

    List<RecrutementDto> recrutementDtos = new ArrayList<>();

}
