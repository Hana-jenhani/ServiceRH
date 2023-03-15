package com.service.RH.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class Candidat {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
