package com.example.qep.mappers;

import com.example.qep.DTO.Request.CircuitRequestDTO;
import com.example.qep.DTO.Response.CircuitResponseDTO;
import com.example.qep.entity.Circuit;
import com.example.qep.entity.DP;

public class CircuitMapper {

    public static Circuit toEntity(CircuitRequestDTO dto, DP dp) {
        if (dto == null || dp == null) {
            throw new IllegalArgumentException("DTO ou DP ne doit pas être null");
        }
        Circuit circuit = new Circuit();
        circuit.setNom(dto.getNom());
        circuit.setDateCreation(dto.getDateCreation());
        circuit.setDp(dp);  // Obligatoire : relation ManyToOne non nullable
        return circuit;
    }
    public static CircuitResponseDTO toResponseDTO(Circuit circuit) {
        CircuitResponseDTO dto = new CircuitResponseDTO();

        dto.setId(circuit.getId());
        dto.setNom(circuit.getNom());
        dto.setDateCreation(circuit.getDateCreation());

        if (circuit.getDp() != null) {
            dto.setDpNom(circuit.getDp().getNom());
        }

        if (circuit.getProgramme() != null) {
            dto.setProgrammeNom(circuit.getProgramme().getNom());
        }

        dto.setTypeAnalyse("TR1"); // Temporary static value
        dto.setNbPlanifies(10);    // Fake counts for now
        dto.setNbRealises(5);
        dto.setNbTermines(3);

        return dto;
    }
}
