package com.service.RH.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paie {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idpaie;
    private int mois;
    private int année;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "idUser", referencedColumnName = "idUser")
    private UserInformation user;
}
