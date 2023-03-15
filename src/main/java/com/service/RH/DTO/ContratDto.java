package com.service.RH.DTO;

import lombok.Data;

import java.util.Date;
@Data
public class ContratDto {

    private Long idCont;
    private String typecontrat;
    private Date datedebut;
    private int duree;
    private String poste;
}
