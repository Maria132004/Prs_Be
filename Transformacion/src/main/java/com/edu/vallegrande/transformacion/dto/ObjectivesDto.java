package com.edu.vallegrande.transformacion.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor
public class ObjectivesDto {

    private Long idObjective;
    private String objectiveName;

}
