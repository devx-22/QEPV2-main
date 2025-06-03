package com.example.qep.services;

import com.example.qep.DTO.Request.GrilleAnalyseRequestDTO;
import com.example.qep.DTO.Response.GrilleAnalyseResponseDTO;
import com.example.qep.entity.GrilleAnalyse;
import com.example.qep.entity.Parametre;
import com.example.qep.mappers.GrilleAnalyseMapper;
import com.example.qep.repository.GrilleAnalyseRepository;
import com.example.qep.repository.ParametreRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GrilleAnalyseService {

    private final GrilleAnalyseRepository grilleRepo;
    private final ParametreRepository parametreRepo;

    public GrilleAnalyseService(GrilleAnalyseRepository grilleRepo, ParametreRepository parametreRepo) {
        this.grilleRepo = grilleRepo;
        this.parametreRepo = parametreRepo;
    }
    public GrilleAnalyseResponseDTO create(GrilleAnalyseRequestDTO dto) {
        List<Parametre> parametres = parametreRepo.findAllById(dto.getParametresIds());
        GrilleAnalyse grille = GrilleAnalyseMapper.toEntity(dto, parametres);
        return GrilleAnalyseMapper.toResponseDTO(grilleRepo.save(grille));
    }
    public List<GrilleAnalyseResponseDTO> getAll() {
        return grilleRepo.findAll().stream()
                .map(GrilleAnalyseMapper::toResponseDTO)
                .toList();
    }
    public Optional<GrilleAnalyseResponseDTO> getById(Long id) {
        return grilleRepo.findById(id).map(GrilleAnalyseMapper::toResponseDTO);
    }
    public void delete(Long id) {
        if (!grilleRepo.existsById(id)) {
            throw new IllegalArgumentException("Grille non trouvée avec l'ID : " + id);
        }
        grilleRepo.deleteById(id);
    }
    public GrilleAnalyseResponseDTO update(Long id, GrilleAnalyseRequestDTO dto) {
        GrilleAnalyse existing = grilleRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Grille non trouvée avec l'ID : " + id));
        existing.setCode(dto.getCode());
        List<Parametre> parametres = parametreRepo.findAllById(dto.getParametresIds());
        existing.setParametres(parametres);
        return GrilleAnalyseMapper.toResponseDTO(grilleRepo.save(existing));
    }

}
