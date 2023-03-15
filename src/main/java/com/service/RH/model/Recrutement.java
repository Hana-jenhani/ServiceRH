package com.service.RH.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Recrutement {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idrec;
    private String poste;
    private String specialite;
    private int nombrepersonne;
    private String description;

    @ManyToOne
    @JoinColumn(name = "idUser", referencedColumnName = "idUser")
    UserInformation user;
}
