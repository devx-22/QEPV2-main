package com.example.qep.controllers;

import com.example.qep.entity.DemandeAnalyse;
import com.example.qep.services.DemandeAnalyseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/demande-analyses")
public class DemandeAnalyseController {

    @Autowired
    private DemandeAnalyseService service;

    @GetMapping
    public List<DemandeAnalyse> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<DemandeAnalyse> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public DemandeAnalyse create(@RequestBody DemandeAnalyse demandeAnalyse) {
        return service.save(demandeAnalyse);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
