package com.example.pathologieactes.Services;

import com.example.pathologieactes.entities.FamilleActe;
import com.example.pathologieactes.entities.Pathologie;
import com.example.pathologieactes.entities.Patient;

public interface IExamService  {
    public Pathologie ajouterPathologie(Pathologie path);
    public Patient ajouterPatientEtAffecterAPathologie(Patient p, String codePath);
    public FamilleActe ajouterFamilleActeEtActeAssocie(FamilleActe facte);
    
}
