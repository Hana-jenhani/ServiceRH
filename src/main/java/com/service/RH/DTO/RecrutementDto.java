package com.service.RH.DTO;

import lombok.Data;

@Data
public class RecrutementDto {
    private Long idrec;
    private String poste;
    private String specialite;
    private int nombrepersonne;
    private String description;
}
