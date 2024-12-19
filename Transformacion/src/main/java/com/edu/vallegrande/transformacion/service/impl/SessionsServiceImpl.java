package com.edu.vallegrande.transformacion.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edu.vallegrande.transformacion.model.SessionStatus;
import com.edu.vallegrande.transformacion.repository.SessionStatusRepository;
import com.edu.vallegrande.transformacion.service.SessionStatusService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SessionsServiceImpl implements SessionStatusService {

    private final SessionStatusRepository sessionStatusRepository;

	@Override
	public List<SessionStatus> listAllSessionStatus() {
		return sessionStatusRepository.findAll();
	}

}
