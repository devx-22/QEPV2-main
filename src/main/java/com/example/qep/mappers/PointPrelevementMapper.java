package com.example.qep.mappers;

import com.example.qep.DTO.Request.PointPrelevementRequestDTO;
import com.example.qep.DTO.Response.PointPrelevementResponseDTO;
import com.example.qep.entity.Circuit;
import com.example.qep.entity.PointPrelevement;

public class PointPrelevementMapper {

    public static PointPrelevement toEntity(PointPrelevementRequestDTO dto, Circuit circuit) {
        PointPrelevement point = new PointPrelevement();
        point.setAdresse(dto.getAdresse());
        point.setCoordX(dto.getCoordX());
        point.setCoordY(dto.getCoordY());
        point.setCodePoint(dto.getCodePoint());
        point.setCircuit(circuit);
        return point;
    }
    public static PointPrelevementResponseDTO toResponseDTO(PointPrelevement entity) {
        PointPrelevementResponseDTO dto = new PointPrelevementResponseDTO();
        dto.setId(entity.getId());
        dto.setAdresse(entity.getAdresse());
        dto.setCoordX(entity.getCoordX());
        dto.setCoordY(entity.getCoordY());
        dto.setCodePoint(entity.getCodePoint());
        dto.setCircuitId(entity.getCircuit() != null ? entity.getCircuit().getId() : null);
        dto.setCircuitNom(entity.getCircuit() != null ? entity.getCircuit().getNom() : null);
        return dto;
    }
}
