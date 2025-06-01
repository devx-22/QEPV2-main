package com.example.qep.mappers;

import com.example.qep.DTO.ParametreDTO;
import com.example.qep.DTO.Request.GrilleAnalyseRequestDTO;
import com.example.qep.DTO.Response.GrilleAnalyseResponseDTO;
import com.example.qep.entity.GrilleAnalyse;
import com.example.qep.entity.Parametre;

import java.util.List;
import java.util.stream.Collectors;

public class GrilleAnalyseMapper {

    public static GrilleAnalyse toEntity(GrilleAnalyseRequestDTO dto, List<Parametre> parametres) {
        GrilleAnalyse grille = new GrilleAnalyse();
        grille.setCode(dto.getCode());
        grille.setParametres(parametres);
        return grille;
    }

    public static GrilleAnalyseResponseDTO toResponseDTO(GrilleAnalyse grille) {
        GrilleAnalyseResponseDTO dto = new GrilleAnalyseResponseDTO();
        dto.setId(grille.getId());
        dto.setCode(grille.getCode());

        List<ParametreDTO> parametreDTOs = grille.getParametres().stream()
                .map(p -> new ParametreDTO(p.getNom(), p.getUnite().getCode()))
                .collect(Collectors.toList());

        dto.setParametres(parametreDTOs);
        return dto;
    }
}
