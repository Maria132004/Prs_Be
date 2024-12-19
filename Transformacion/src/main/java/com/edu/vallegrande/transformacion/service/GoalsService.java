package com.edu.vallegrande.transformacion.service;

import java.util.List;
import java.util.Optional;

import com.edu.vallegrande.transformacion.dto.GoalDto;
import com.edu.vallegrande.transformacion.model.Goal;
import com.edu.vallegrande.transformacion.model.Objective;

public interface GoalsService {

	List<Goal> listAllGoals();
	
	Objective findGoalsById(Long id);

    Goal addGoal(Goal goals);

    Goal updateGoal(Long id, GoalDto goals);

    void deleteGoal(Long id);

    Optional<Goal> findGoalById(Long id);

}
