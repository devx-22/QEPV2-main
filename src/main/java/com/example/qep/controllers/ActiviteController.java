package com.example.qep.controllers;

import com.example.qep.entity.Activite;
import com.example.qep.services.ActiviteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/activites")
public class ActiviteController {

    private final ActiviteService activiteService;

    public ActiviteController(ActiviteService activiteService) {
        this.activiteService = activiteService;
    }

    @PostMapping
    public ResponseEntity<Activite> create(@RequestBody Activite activite) {
        return ResponseEntity.ok(activiteService.create(activite.getCode()));
    }

    @GetMapping
    public ResponseEntity<List<Activite>> getAll() {
        return ResponseEntity.ok(activiteService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Activite> getById(@PathVariable Long id) {
        return activiteService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        try {
            activiteService.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<Activite> update(@PathVariable Long id, @RequestBody Activite dto) {
        try {
            Activite updated = activiteService.updateById(id, dto.getCode());
            return ResponseEntity.ok(updated);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }


}
