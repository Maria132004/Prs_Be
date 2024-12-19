package com.edu.vallegrande.transformacion.service;

import java.util.List;
import java.util.Optional;

import com.edu.vallegrande.transformacion.dto.SessionDto;
import com.edu.vallegrande.transformacion.model.Session;

public interface SessionsService {

	List<Session> listAllSessions(); //ok

	Optional<Session> findSessionById(Long id);
	
    Session addSession(Session session);

    Session updateSession(Long id, SessionDto session);

    Session updateSession(Long id, Session session);

    void deleteSession(Long id);

    Optional<Session> findSessionsBySessionNumber(int sessionNumber);

    Optional<Session> findSessionsByTopic(String topic);

    Optional<Session> findSessionsByObjective(Long idObjective);

    Optional<Session> findSessionsByObjectiveAndGoal(Long idObjective, Long idGoal);
}
