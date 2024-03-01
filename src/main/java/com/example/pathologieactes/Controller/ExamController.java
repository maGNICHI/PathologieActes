package com.example.pathologieactes.Controller;

import com.example.pathologieactes.Services.IExamService;
import com.example.pathologieactes.entities.FamilleActe;
import com.example.pathologieactes.entities.Pathologie;
import com.example.pathologieactes.entities.Patient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class ExamController {
    IExamService examService;
    @PostMapping("/pathologie")
    public Pathologie ajouterPathologie(@RequestBody Pathologie path){
        return examService.ajouterPathologie(path );
    }
    @PostMapping("/patient/{codePath}")
    public Patient ajouterPatientEtAffecterAPathologie( @RequestBody Patient p, @PathVariable String codePath) {
        return examService.ajouterPatientEtAffecterAPathologie(p,codePath);
    }
    @PostMapping("/ajouterfamilleacte")
    public FamilleActe ajouterFamilleActeEtActeAssocie(@RequestBody FamilleActe facte){
        return examService.ajouterFamilleActeEtActeAssocie(facte);
    }

}
