package com.edu.vallegrande.transformacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.vallegrande.transformacion.model.Goal;

@Repository
public interface GoalsRepository extends JpaRepository<Goal, Long> {
    // Additional custom queries (if any) go here.
}
