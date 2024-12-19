package com.edu.vallegrande.transformacion.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edu.vallegrande.transformacion.dto.GoalDto;
import com.edu.vallegrande.transformacion.model.Goal;
import com.edu.vallegrande.transformacion.model.Objective;
import com.edu.vallegrande.transformacion.repository.GoalsRepository;
import com.edu.vallegrande.transformacion.service.GoalsService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GoalsServiceImpl implements GoalsService {

    private final GoalsRepository goalsRepository;

    @Override
    public List<Goal> listAllGoals() {
        return goalsRepository.findAll();
    }

    @Override
    public Goal addGoal(Goal goal) {
        return goalsRepository.save(goal);
    }

    @Override
    public void deleteGoal(Long id) {
        goalsRepository.deleteById(id);
    }

    @Override
    public Optional<Goal> findGoalById(Long id) {
        return goalsRepository.findById(id);
    }

	@Override
	public Goal updateGoal(Long id, GoalDto goals) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Objective findGoalsById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
