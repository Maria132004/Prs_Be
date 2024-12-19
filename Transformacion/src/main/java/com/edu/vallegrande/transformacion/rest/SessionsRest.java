package com.edu.vallegrande.transformacion.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.vallegrande.transformacion.model.Session;
import com.edu.vallegrande.transformacion.service.SessionsService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/sessions")
public class SessionsRest {

	private final SessionsService sessionService;

	// Obtener todas las sesiones
	@GetMapping
	public ResponseEntity<List<Session>> getAllSessions() {
		return ResponseEntity.ok(sessionService.listAllSessions());
	}

	// Obtener una sesión por ID
	@GetMapping("/{id}")
	public ResponseEntity<Session> getSessionById(@PathVariable Long id) {
		Optional<Session> optional = sessionService.findSessionById(id);
		ResponseEntity.notFound().build();
		return optional.isPresent() ? ResponseEntity.ok(optional.get()) : ResponseEntity.notFound().build();
	}

	// Crear una nueva sesión
	@PostMapping
	public ResponseEntity<Session> createSession(@RequestBody Session session) {
		log.info("SESIONN::::"+session);
		sessionService.addSession(session);

		return ResponseEntity.ok(session);
	}

	// Actualizar una sesión por ID
	@PutMapping("/{id}")
	public ResponseEntity<Session> updateSession(@PathVariable Long id, @RequestBody Session session) {
		return null;
	}

	// Eliminar una sesión por ID
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteSession(@PathVariable Long id) {
		return null;
	}
}
