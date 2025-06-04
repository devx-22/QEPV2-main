package com.example.qep.controllers;

import com.example.qep.entity.EtatAccreditation;
import com.example.qep.services.EtatAccreditationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/etat-accreditations")
public class EtatAccreditationController {

    private final EtatAccreditationService service;

    public EtatAccreditationController(EtatAccreditationService service) {
        this.service = service;
    }
    @GetMapping
    public List<EtatAccreditation> getAll() {
        return service.FindAllEtatAccreditation();
    }
    @GetMapping("/{id}")
    public ResponseEntity<EtatAccreditation> getById(@PathVariable Long id) {
        return service.FindEtatAccreditationById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public ResponseEntity<EtatAccreditation> create(@RequestBody EtatAccreditation entity) {
        return ResponseEntity.ok(service.SaveEtatAccreditation(entity));
    }
    @PutMapping("/{id}")
    public ResponseEntity<EtatAccreditation> update(@PathVariable Long id, @RequestBody EtatAccreditation entity) {
        if (!service.FindEtatAccreditationById(id).isPresent()) return ResponseEntity.notFound().build();
        entity.setId(id);
        return ResponseEntity.ok(service.SaveEtatAccreditation(entity));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.DeleteEtatAccreditation(id);
        return ResponseEntity.noContent().build();
    }
    @PostMapping("/saveAll")
    public ResponseEntity<List<EtatAccreditation>> createAll(@RequestBody List<EtatAccreditation> etatAccreditations) {
        return ResponseEntity.ok(service.SaveAllNormes(etatAccreditations));
    }

}
