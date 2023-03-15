package com.service.RH.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class CandidatDto {
    private Long idCand;
    private String prenom;
    private String nom;
    private Date datenaissance;
    private int tel;
    private String email;
    private String cin;
    private String adresse ;
    private String ville;
    private String nationalite;
    private String pathCv;
    private String pathMotivationLetter;
    private String niveauEtude;
    private String titreDiplome;
    private String universite;
    private String niveauExp;
    private String experience;
}
