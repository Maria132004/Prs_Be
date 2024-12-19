package com.edu.vallegrande.transformacion.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.vallegrande.transformacion.model.SessionStatus;
import com.edu.vallegrande.transformacion.service.SessionStatusService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/session-status")
public class SessionStatusRest {
	
	private final SessionStatusService sessionStatusService;

	@GetMapping
	public ResponseEntity<List<SessionStatus>> getAllSessions() {
		return ResponseEntity.ok(sessionStatusService.listAllSessionStatus());
	}
}
