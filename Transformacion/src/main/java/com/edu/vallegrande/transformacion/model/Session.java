package com.edu.vallegrande.transformacion.model;


import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity @Table(name="sessions")
public class Session {

    @Id
    @Column(name = "id_session")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSession;
    private String name;
    private String topic;
    private LocalDate creationDate;
    
//    private Long idSessionStatus; //fk
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_session_status",referencedColumnName = "id_session_status")
    private SessionStatus sessionStatus;
    
    private String goal;
    private LocalDate statusUpdateDate;
    
//    private Long idResponsible;//fk
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_responsible", referencedColumnName = "id_responsible")
    private Responsible responsible;
    
//    private Long idPlan;//fk
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_plan", referencedColumnName = "id_plan")
    private Plan plan;
    
    @JsonManagedReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "session")
    private List<Objective> objectives;
}
