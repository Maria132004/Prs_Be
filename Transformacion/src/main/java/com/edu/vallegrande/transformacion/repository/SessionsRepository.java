package com.edu.vallegrande.transformacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.edu.vallegrande.transformacion.model.Session;


@Repository
public interface SessionsRepository extends JpaRepository<Session, Long> {

    Session findByName(String name);
    Session findByTopic(String topic);
    
}
