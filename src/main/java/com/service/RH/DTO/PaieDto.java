package com.service.RH.DTO;

import lombok.Data;

import java.util.Date;
@Data
public class PaieDto {
    private Long idpaie;
    private int mois;
    private int année;
    private Date date;
}
