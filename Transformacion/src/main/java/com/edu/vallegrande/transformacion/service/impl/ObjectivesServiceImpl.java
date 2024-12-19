package com.edu.vallegrande.transformacion.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edu.vallegrande.transformacion.dto.ObjectivesDto;
import com.edu.vallegrande.transformacion.model.Objective;
import com.edu.vallegrande.transformacion.repository.ObjectivesRepository;
import com.edu.vallegrande.transformacion.service.ObjectivesService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
class ObjectivesServiceImpl implements ObjectivesService {

    private final ObjectivesRepository objectivesRepository;

    @Override
    public List<Objective> listAllObjectives() {
        return objectivesRepository.findAll();
    }

    @Override
    public Objective addObjective(Objective objective) {
        return objectivesRepository.save(objective);
    }

    @Override
    public void deleteObjective(Long id) {
    	objectivesRepository.deleteById(id);
    }

    @Override
    public Objective findObjectiveById(Long id) {
        return objectivesRepository.findById(id).get();
    }

	@Override
	public Objective updateObjective(Long id, ObjectivesDto objective) {
		// TODO Auto-generated method stub
		return null;
	}
}
