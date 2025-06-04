package com.example.qep.controllers;

import com.example.qep.DTO.Request.GrilleAnalyseRequestDTO;
import com.example.qep.DTO.Response.GrilleAnalyseResponseDTO;
import com.example.qep.services.GrilleAnalyseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/grilles")
public class GrilleAnalyseController {

    private final GrilleAnalyseService grilleService;

    public GrilleAnalyseController(GrilleAnalyseService grilleService) {
        this.grilleService = grilleService;
    }
    @PostMapping
    public ResponseEntity<GrilleAnalyseResponseDTO> create(@RequestBody GrilleAnalyseRequestDTO dto) {
        return ResponseEntity.ok(grilleService.create(dto));
    }
    @GetMapping
    public ResponseEntity<List<GrilleAnalyseResponseDTO>> getAll() {
        return ResponseEntity.ok(grilleService.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<GrilleAnalyseResponseDTO> getById(@PathVariable Long id) {
        return grilleService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PutMapping("/{id}")
    public ResponseEntity<GrilleAnalyseResponseDTO> update(@PathVariable Long id, @RequestBody GrilleAnalyseRequestDTO dto) {
        try {
            return ResponseEntity.ok(grilleService.update(id, dto));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        try {
            grilleService.delete(id);
            return ResponseEntity.noContent().build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

}
