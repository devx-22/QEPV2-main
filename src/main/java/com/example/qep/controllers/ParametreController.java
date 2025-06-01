package com.example.qep.controllers;

import com.example.qep.entity.Parametre;
import com.example.qep.services.ParametreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parametres")
@CrossOrigin(origins = "*")
public class ParametreController {

    @Autowired
    private ParametreService parametreService;

    @GetMapping
    public ResponseEntity<List<Parametre>> getAll() {
        return ResponseEntity.ok(parametreService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Parametre> getById(@PathVariable Long id) {
        return parametreService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Parametre> save(@RequestBody Parametre parametre) {
        return ResponseEntity.ok(parametreService.save(parametre));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        parametreService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
