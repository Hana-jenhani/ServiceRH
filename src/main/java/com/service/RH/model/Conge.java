package com.service.RH.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Conge implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCong;
    private String typeCong;
    private Date debutCong;
    private Date finCong;
    private Date createdAt;
    private String description;
    private int duree ;

    @ManyToOne
    @JoinColumn(name = "idUser", referencedColumnName = "idUser")
    private UserInformation user;
}
