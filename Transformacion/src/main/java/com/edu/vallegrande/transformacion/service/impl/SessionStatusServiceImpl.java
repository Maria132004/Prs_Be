package com.edu.vallegrande.transformacion.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edu.vallegrande.transformacion.dto.SessionDto;
import com.edu.vallegrande.transformacion.model.Objective;
import com.edu.vallegrande.transformacion.model.Plan;
import com.edu.vallegrande.transformacion.model.Responsible;
import com.edu.vallegrande.transformacion.model.Session;
import com.edu.vallegrande.transformacion.model.SessionStatus;
import com.edu.vallegrande.transformacion.repository.ObjectivesRepository;
import com.edu.vallegrande.transformacion.repository.PlansRepository;
import com.edu.vallegrande.transformacion.repository.ResponsiblesRepository;
import com.edu.vallegrande.transformacion.repository.SessionStatusRepository;
import com.edu.vallegrande.transformacion.repository.SessionsRepository;
import com.edu.vallegrande.transformacion.service.SessionsService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor @Slf4j
public class SessionStatusServiceImpl implements SessionsService {

    private final SessionsRepository sessionsRepository;
    private final PlansRepository plansRepository;
    private final ResponsiblesRepository responsiblesRepository;
    private final SessionStatusRepository sessionStatusRepository;
    private final ObjectivesRepository objectivesRepository;
    
    @Override
    public List<Session> listAllSessions() {
        return sessionsRepository.findAll();
    }

    @Override
    public Session addSession(Session session) {
    	Optional<Plan> planOptional = plansRepository.findById(session.getPlan().getIdPlan());
    	Optional<Responsible> respOptional= responsiblesRepository.findById(session.getResponsible().getIdResponsible());
    	Optional<SessionStatus> statusOptional= sessionStatusRepository.findById(session.getSessionStatus().getIdSessionStatus());
    	
    	ArrayList<Objective> savedObjectives = new ArrayList<Objective>();
    	
    	
    	Session sessionToSave= new Session();
    	sessionToSave.setResponsible(respOptional.get());
    	sessionToSave.setPlan(planOptional.get());
    	sessionToSave.setSessionStatus(statusOptional.get());
    	sessionToSave.setObjectives(savedObjectives);
    	
    	sessionToSave.setName(session.getName());
    	sessionToSave.setTopic(session.getTopic());
    	sessionToSave.setCreationDate(LocalDate.now());
    	sessionToSave.setStatusUpdateDate(LocalDate.now());
    	sessionToSave.setGoal(session.getGoal());
    	
    	log.info("ANTES SAVE:"+sessionToSave);
    	sessionsRepository.save(sessionToSave);
    	log.info("DESPUES SAVE:"+sessionToSave);
    	
    	for (Objective objective : session.getObjectives()) {
    		Objective objectiveToSave = new Objective();
    		objectiveToSave.setName(objective.getName());
    		objectiveToSave.setSession(sessionToSave);
    		objectivesRepository.save(objectiveToSave);
    		
    		savedObjectives.add(objectiveToSave);
    	}
    	
        return sessionToSave;
    }

    @Override
    public void deleteSession(Long id) {
        sessionsRepository.deleteById(id);
    }
    @Override
    public Optional<Session> findSessionById(Long id) {
        return sessionsRepository.findById(id);
    }

	@Override
	public Session updateSession(Long id, SessionDto session) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Session updateSession(Long id, Session session) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Session> findSessionsBySessionNumber(int sessionNumber) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Session> findSessionsByTopic(String topic) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Session> findSessionsByObjective(Long idObjective) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Session> findSessionsByObjectiveAndGoal(Long idObjective, Long idGoal) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
}
