package com.service.RH.model;





import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contrat {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCont;
    private String typecontrat;
    private Date datedebut;
    private int duree;
    private String poste;

    @ManyToOne
    @JoinColumn(name = "idUser", referencedColumnName = "idUser")
    private UserInformation user;
}
