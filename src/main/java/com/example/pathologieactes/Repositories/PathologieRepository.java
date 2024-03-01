package com.example.pathologieactes.Repositories;

import com.example.pathologieactes.entities.Pathologie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.file.Path;

public interface PathologieRepository extends JpaRepository<Pathologie,Long> {
    Pathologie findByCodePath( String code);
}
