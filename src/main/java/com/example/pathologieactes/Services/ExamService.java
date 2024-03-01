package com.example.pathologieactes.Services;

import com.example.pathologieactes.Repositories.ActeRepository;
import com.example.pathologieactes.Repositories.FamilleActeRepository;
import com.example.pathologieactes.Repositories.PathologieRepository;
import com.example.pathologieactes.Repositories.PatientRepository;
import com.example.pathologieactes.entities.Acte;
import com.example.pathologieactes.entities.FamilleActe;
import com.example.pathologieactes.entities.Pathologie;
import com.example.pathologieactes.entities.Patient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ExamService implements IExamService{
    PathologieRepository pathologieRepository;
    PatientRepository patientRepository;
    FamilleActeRepository familleActeRepository;
    ActeRepository acteRepository;
    @Override
    public Pathologie ajouterPathologie(Pathologie path) {
        path.setArchive(false);
        return pathologieRepository.save(path);
    }
    @Override
    public Patient ajouterPatientEtAffecterAPathologie(Patient p, String codePath) {
        Pathologie path=pathologieRepository.findByCodePath(codePath);
        p.getPathologies().add(path);
        return patientRepository.save(p);
    }
    @Override
    public FamilleActe ajouterFamilleActeEtActeAssocie(FamilleActe facte) {
        FamilleActe savedFamille=familleActeRepository.save(facte);
      List<Acte> listactes=savedFamille.getActes();
      for ( Acte acte: listactes){
          acte.setFamilleActe(savedFamille);
          acteRepository.save(acte);
      }
       /** savedFamille.getActes().forEach(
               acte -> acte.setFamilleActe(savedFamille);
                acteRepository.save(acte);
        );**/
        return savedFamille;
    }


}
