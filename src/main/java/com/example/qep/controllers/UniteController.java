package com.example.qep.controllers;

import com.example.qep.entity.Unite;
import com.example.qep.services.UniteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/unites")
public class UniteController {

    private final UniteService service;

    public UniteController(UniteService service) {
        this.service = service;
    }
    @GetMapping
    public List<Unite> getAll() {
        return service.FindAllUnites();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Unite> getById(@PathVariable Long id) {
        return service.FindUniteById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public ResponseEntity<Unite> create(@RequestBody Unite unite) {
        return ResponseEntity.ok(service.SaveUnite(unite));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Unite> update(@PathVariable Long id, @RequestBody Unite unite) {
        if (!service.FindUniteById(id).isPresent()) return ResponseEntity.notFound().build();
        unite.setId(id);
        return ResponseEntity.ok(service.SaveUnite(unite));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.DeleteUnite(id);
        return ResponseEntity.noContent().build();
    }
    @PostMapping("/saveAll")
    public ResponseEntity<List<Unite>> createAll(@RequestBody List<Unite> unites) {
        return ResponseEntity.ok(service.SaveAllNormes(unites));
    }

}
