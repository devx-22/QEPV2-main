package com.example.qep.Controller;

import com.example.qep.DTO.Request.PointPrelevementRequestDTO;
import com.example.qep.DTO.Response.PointPrelevementResponseDTO;
import com.example.qep.Service.PointPrelevementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/points")
public class PointPrelevementController {

    private final PointPrelevementService pointService;

    public PointPrelevementController(PointPrelevementService pointService) {
        this.pointService = pointService;
    }

    @GetMapping
    public ResponseEntity<List<PointPrelevementResponseDTO>> getAll() {
        return ResponseEntity.ok(pointService.getAllDTOs());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return pointService.getDTOById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Optional<ResponseEntity<PointPrelevementResponseDTO>> create(@RequestBody PointPrelevementRequestDTO dto) {
        return pointService.createPoint(dto)
                .map(ResponseEntity::ok);
    }

    @PutMapping("/{id}")
    public Optional<ResponseEntity<PointPrelevementResponseDTO>> update(@PathVariable Long id, @RequestBody PointPrelevementRequestDTO dto) {
        return pointService.updatePoint(id, dto)
                .map(ResponseEntity::ok);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        pointService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/by-circuit/{circuitId}")
    public ResponseEntity<List<PointPrelevementResponseDTO>> getByCircuit(@PathVariable Long circuitId) {
        return ResponseEntity.ok(pointService.getByCircuitDTOs(circuitId));
    }
}
