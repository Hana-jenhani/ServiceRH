package com.service.RH.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class CongeDto {
    private Long idCong;
    private String typeCong;
    private Date debutCong;
    private Date finCong;
    private Date createdAt;
    private String description;
    private int duree ;
}
