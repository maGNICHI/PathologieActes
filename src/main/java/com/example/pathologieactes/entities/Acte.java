package com.example.pathologieactes.entities;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;
import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Acte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idActe;
    String codeActe;
    int cotationActe;
    float prixUnitaireActe;
    String designationActe;
    @ManyToMany(mappedBy = "actes")
    List<Pathologie> pathologies;
    @ManyToOne
FamilleActe familleActe;

}
