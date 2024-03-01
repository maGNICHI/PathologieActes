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
public class Pathologie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idPath;
    @Column(unique = true)
    String codePath;
    String libelle;
    boolean archive;
    @ManyToMany
    List<Acte> actes;
}
