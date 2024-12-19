package com.edu.vallegrande.transformacion.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.vallegrande.transformacion.dto.ObjectivesDto;
import com.edu.vallegrande.transformacion.model.Objective;
import com.edu.vallegrande.transformacion.service.ObjectivesService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/objectives")
public class ObjectivesRest {

	private final ObjectivesService objectivesService;

	// Obtener todos los objetivos
	@GetMapping
	public List<Objective> getAllObjectives() {
		return objectivesService.listAllObjectives();
	}

	// Obtener un objetivo por ID
	@GetMapping("/{id}")
	public ResponseEntity<ObjectivesDto> getObjectiveById(@PathVariable Long id) {

		return null;
	}

	// Crear un nuevo objetivo
	@PostMapping
	public ResponseEntity<ObjectivesDto> createObjective(@RequestBody ObjectivesDto objectivesDto) {
		return null;
	}

	// Actualizar un objetivo por ID
	@PutMapping("/{id}")
	public ResponseEntity<Objective> updateObjective(@PathVariable Long id, @RequestBody ObjectivesDto objectivesDto) {
		return null;
	}

	// Eliminar un objetivo por ID
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteObjective(@PathVariable Long id) {
		return null;
	}
}
