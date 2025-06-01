package com.example.qep.Service;

import com.example.qep.DTO.Request.PointPrelevementRequestDTO;
import com.example.qep.DTO.Response.PointPrelevementResponseDTO;
import com.example.qep.entity.Circuit;
import com.example.qep.entity.PointPrelevement;
import com.example.qep.mappers.PointPrelevementMapper;
import com.example.qep.repository.CircuitRepository;
import com.example.qep.repository.PointPrelevementRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PointPrelevementService {

    private final PointPrelevementRepository pointRepository;
    private final CircuitRepository circuitRepository;

    public PointPrelevementService(PointPrelevementRepository pointRepository, CircuitRepository circuitRepository) {
        this.pointRepository = pointRepository;
        this.circuitRepository = circuitRepository;
    }

    public List<PointPrelevementResponseDTO> getAllDTOs() {
        return pointRepository.findAll().stream()
                .map(PointPrelevementMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    public Optional<PointPrelevementResponseDTO> getDTOById(Long id) {
        return pointRepository.findById(id)
                .map(PointPrelevementMapper::toResponseDTO);
    }

    public Optional<PointPrelevementResponseDTO> createPoint(PointPrelevementRequestDTO dto) {
        return circuitRepository.findById(dto.getCircuitId()).map(circuit -> {
            PointPrelevement entity = PointPrelevementMapper.toEntity(dto, circuit);
            return PointPrelevementMapper.toResponseDTO(pointRepository.save(entity));
        });
    }

    public Optional<PointPrelevementResponseDTO> updatePoint(Long id, PointPrelevementRequestDTO dto) {
        Optional<Circuit> circuitOpt = circuitRepository.findById(dto.getCircuitId());
        if (circuitOpt.isEmpty()) return Optional.empty();

        return pointRepository.findById(id).map(existing -> {
            existing.setAdresse(dto.getAdresse());
            existing.setCoordX(dto.getCoordX());
            existing.setCoordY(dto.getCoordY());
            existing.setCodePoint(dto.getCodePoint());
            existing.setCircuit(circuitOpt.get());
            return PointPrelevementMapper.toResponseDTO(pointRepository.save(existing));
        });
    }

    public void delete(Long id) {
        pointRepository.deleteById(id);
    }

    public List<PointPrelevementResponseDTO> getByCircuitDTOs(Long circuitId) {
        return pointRepository.findByCircuitId(circuitId).stream()
                .map(PointPrelevementMapper::toResponseDTO)
                .collect(Collectors.toList());
    }
}
