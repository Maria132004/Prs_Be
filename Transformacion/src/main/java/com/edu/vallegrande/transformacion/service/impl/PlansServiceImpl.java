package com.edu.vallegrande.transformacion.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edu.vallegrande.transformacion.model.Plan;
import com.edu.vallegrande.transformacion.repository.PlansRepository;
import com.edu.vallegrande.transformacion.service.PlansService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PlansServiceImpl implements PlansService {

    private final PlansRepository plansRepository;

	@Override
	public List<Plan> listAllPlans() {
		return plansRepository.findAll();
	}

}
