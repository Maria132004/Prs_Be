package com.edu.vallegrande.transformacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.vallegrande.transformacion.model.Objective;

@Repository
public interface ObjectivesRepository extends JpaRepository<Objective, Long> {
    // Custom query methods (if any) can be defined here.
}
