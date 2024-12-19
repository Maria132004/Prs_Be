package com.edu.vallegrande.transformacion.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity @Table(name="goals")
public class Goal {
    @Id
    @Column(name = "id_goal")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGoal;
    private String name;
    private String description;
}

