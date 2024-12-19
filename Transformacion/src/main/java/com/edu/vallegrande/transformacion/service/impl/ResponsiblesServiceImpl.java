package com.edu.vallegrande.transformacion.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edu.vallegrande.transformacion.model.Responsible;
import com.edu.vallegrande.transformacion.repository.ResponsiblesRepository;
import com.edu.vallegrande.transformacion.service.ResponsiblesService;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class ResponsiblesServiceImpl implements ResponsiblesService {

    private final ResponsiblesRepository responsiblesRepository;

	@Override
	public List<Responsible> listAllResponsibles() {
		return responsiblesRepository.findAll();
	}



}
