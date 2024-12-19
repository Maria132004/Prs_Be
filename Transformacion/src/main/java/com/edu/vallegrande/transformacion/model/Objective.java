package com.edu.vallegrande.transformacion.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Data
@Entity @Table(name="objectives")
public class Objective {

    @Id
    @Column(name = "id_objective")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idObjective;
    private String name;
    
//    private Long idSession;//fk
    @JsonBackReference @ToString.Exclude
    @ManyToOne
    @JoinColumn(name="id_session", referencedColumnName = "id_session")
    private Session session; //ref

}
