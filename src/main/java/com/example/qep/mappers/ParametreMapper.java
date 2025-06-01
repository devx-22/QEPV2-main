package com.example.qep.mappers;

import com.example.qep.DTO.Request.ParametreRequestDTO;
import com.example.qep.DTO.Response.ParametreResponseDTO;
import com.example.qep.entity.*;

import java.util.Optional;

public class ParametreMapper {

    public static Parametre toEntity(
            ParametreRequestDTO dto,
            Optional<Unite> unite,
            Optional<Norme> norme,
            Optional<EtatAccreditation> etatAccreditation) {
        Parametre parametre = new Parametre();
        parametre.setNom(dto.getNom());
        parametre.setVma(dto.getVma());
        parametre.setType(TypeParametre.valueOf(dto.getType().toUpperCase()));
        parametre.setUnite(unite.orElseThrow(() ->
                new IllegalArgumentException("Unité non trouvée avec id: " + dto.getUniteId())));
        parametre.setNorme(norme.orElseThrow(() ->
                new IllegalArgumentException("Norme non trouvée avec id: " + dto.getNormeId())));
        parametre.setEtatAccreditation(etatAccreditation.orElseThrow(() ->
                new IllegalArgumentException("État d'accréditation non trouvé avec id: " + dto.getEtatAccreditationId())));

        return parametre;
    }

    public static ParametreResponseDTO toResponseDTO(Parametre parametre) {
        ParametreResponseDTO dto = new ParametreResponseDTO();
        dto.setId(parametre.getId());
        dto.setNom(parametre.getNom());
        dto.setVma(parametre.getVma());
        dto.setType(parametre.getType().name());
        dto.setUnite(parametre.getUnite().getCode());
        dto.setNorme(parametre.getNorme().getReference() + " " + parametre.getNorme().getVersion());
        dto.setEtatAccreditation(parametre.getEtatAccreditation().getCode());
        return dto;
    }
}
