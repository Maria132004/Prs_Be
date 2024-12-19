package com.edu.vallegrande.transformacion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity @Table(name="responsibles")
public class Responsible {
	
	@Id
	@Column(name = "id_responsible")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idResponsible;
	private String name;
	private String lastname; 
}
