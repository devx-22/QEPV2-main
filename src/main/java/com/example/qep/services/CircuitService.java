package com.example.qep.Service;

import com.example.qep.DTO.Request.CircuitRequestDTO;
import com.example.qep.DTO.Response.CircuitResponseDTO;
import com.example.qep.entity.Circuit;
import com.example.qep.entity.DP;
import com.example.qep.mappers.CircuitMapper;
import com.example.qep.repository.CircuitRepository;
import com.example.qep.repository.DPRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CircuitService {

    private final CircuitRepository circuitRepository;
    private final DPRepository dpRepository;

    public CircuitService(CircuitRepository circuitRepository, DPRepository dpRepository) {
        this.circuitRepository = circuitRepository;
        this.dpRepository = dpRepository;
    }

    public List<CircuitResponseDTO> getAllCircuits() {
        return circuitRepository.findAll().stream()
                .map(CircuitMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    public Optional<CircuitResponseDTO> getCircuitById(Long id) {
        return circuitRepository.findById(id)
                .map(CircuitMapper::toResponseDTO);
    }

    public Optional<CircuitResponseDTO> createCircuit(CircuitRequestDTO dto) {
        return dpRepository.findById(dto.getDpId()).map(dp -> {
            Circuit entity = CircuitMapper.toEntity(dto, dp);
            return CircuitMapper.toResponseDTO(circuitRepository.save(entity));
        });
    }

    public Optional<CircuitResponseDTO> updateCircuit(Long id, CircuitRequestDTO dto) {
        Optional<DP> dpOpt = dpRepository.findById(dto.getDpId());
        if (dpOpt.isEmpty()) return Optional.empty();

        return circuitRepository.findById(id).map(existing -> {
            existing.setNom(dto.getNom());
            existing.setDateCreation(dto.getDateCreation());
            existing.setDp(dpOpt.get());
            return CircuitMapper.toResponseDTO(circuitRepository.save(existing));
        });
    }

    public void deleteCircuit(Long id) {
        circuitRepository.deleteById(id);
    }

    public List<CircuitResponseDTO> getCircuitsByDpId(Long dpId) {
        return circuitRepository.findByDpId(dpId).stream()
                .map(CircuitMapper::toResponseDTO)
                .collect(Collectors.toList());
    }
}
