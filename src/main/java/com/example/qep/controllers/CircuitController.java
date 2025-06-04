package com.example.qep.controllers;

import com.example.qep.DTO.Request.CircuitRequestDTO;
import com.example.qep.DTO.Response.CircuitResponseDTO;
import com.example.qep.services.CircuitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/circuits")
public class CircuitController {

    private final CircuitService circuitService;

    public CircuitController(CircuitService circuitService) {
        this.circuitService = circuitService;
    }

    @GetMapping
    public ResponseEntity<List<CircuitResponseDTO>> getAll() {
        return ResponseEntity.ok(circuitService.getAllCircuits());
    }

    @GetMapping("/{id}")
    public Optional<ResponseEntity<CircuitResponseDTO>> getById(@PathVariable Long id) {
        return circuitService.getCircuitById(id)
                .map(ResponseEntity::ok);
    }

    @PostMapping
    public Optional<ResponseEntity<CircuitResponseDTO>> create(@RequestBody CircuitRequestDTO dto) {
        return circuitService.createCircuit(dto)
                .map(ResponseEntity::ok);
    }

    @PutMapping("/{id}")
    public Optional<ResponseEntity<CircuitResponseDTO>> update(@PathVariable Long id, @RequestBody CircuitRequestDTO dto) {
        return circuitService.updateCircuit(id, dto)
                .map(ResponseEntity::ok);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        circuitService.deleteCircuit(id);
        return ResponseEntity.noContent().build();
    }
}
