package com.example.pathologieactes.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idPatient;
    @Enumerated(EnumType.STRING)
    TypePieceIdentite typePieceIdentite;
    @Temporal(TemporalType.DATE)
    Date dateEmission;
    String nomP;
    String prenomP;
    @ManyToMany
    List<Pathologie> pathologies=new ArrayList<>();


}
