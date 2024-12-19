package com.edu.vallegrande.transformacion.service;

import java.util.List;

import com.edu.vallegrande.transformacion.dto.ObjectivesDto;
import com.edu.vallegrande.transformacion.model.Objective;

public interface ObjectivesService {

	List<Objective> listAllObjectives();

	Objective findObjectiveById(Long id);

	Objective addObjective(Objective objective);

	Objective updateObjective(Long id, ObjectivesDto objective);

	void deleteObjective(Long id);

}