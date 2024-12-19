package com.edu.vallegrande.transformacion.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.vallegrande.transformacion.model.Responsible;
import com.edu.vallegrande.transformacion.service.ResponsiblesService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/responsibles")
public class ResponsiblesRest {
	
	private final ResponsiblesService responsiblesService;

	@GetMapping
	public ResponseEntity<List<Responsible>> getAllSessions() {
		return ResponseEntity.ok(responsiblesService.listAllResponsibles());
	}
}
