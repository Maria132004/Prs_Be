package com.edu.vallegrande.transformacion.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor
public class SessionDto {

    private Long idSession;
    private String sessionNumber;
    private String topic;
    private Long idObjective;
    private Long idGoal;
    private String date;
}

