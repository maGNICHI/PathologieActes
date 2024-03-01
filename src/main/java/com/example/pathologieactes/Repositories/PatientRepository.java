package com.example.pathologieactes.Repositories;

import com.example.pathologieactes.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
