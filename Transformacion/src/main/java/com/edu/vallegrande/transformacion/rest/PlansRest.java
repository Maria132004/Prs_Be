package com.edu.vallegrande.transformacion.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.vallegrande.transformacion.model.Plan;
import com.edu.vallegrande.transformacion.service.PlansService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/plans")
public class PlansRest {
	
	private final PlansService plansService;

	@GetMapping
	public ResponseEntity<List<Plan>> getAllSessions() {
		return ResponseEntity.ok(plansService.listAllPlans());
	}
}
