package com.edu.vallegrande.transformacion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity @Table(name="session_status")
public class SessionStatus {
	@Id
	@Column(name = "id_session_status")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSessionStatus;
	private String name;
	private String description;

}
