package com.service.RH.DTO;

import lombok.Data;

import java.time.LocalDate;
@Data
public class PresenceDto {
    private long id;
    private LocalDate day;
    private int nbrheures;
}
