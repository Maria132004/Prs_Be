package com.edu.vallegrande.transformacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.vallegrande.transformacion.model.Plan;

@Repository
public interface PlansRepository extends JpaRepository<Plan, Long> {
}
