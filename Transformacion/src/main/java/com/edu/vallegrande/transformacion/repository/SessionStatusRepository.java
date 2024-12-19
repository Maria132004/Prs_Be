package com.edu.vallegrande.transformacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.vallegrande.transformacion.model.SessionStatus;

@Repository
public interface SessionStatusRepository extends JpaRepository<SessionStatus, Long> {
}
