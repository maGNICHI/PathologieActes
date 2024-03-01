package com.example.pathologieactes.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class FamilleActe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idFa;
    String codeFa;
    String libelle;
    String description;
    @OneToMany(mappedBy = "familleActe",cascade = CascadeType.ALL)
List<Acte> actes;
}
