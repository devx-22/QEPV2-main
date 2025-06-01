package com.example.qep.controllers;

import com.example.qep.entity.ValeurAnalyse;
import com.example.qep.services.ValeurAnalyseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/valeurs")
public class ValeurAnalyseController {

    @Autowired
    private ValeurAnalyseService service;

    @GetMapping
    public List<ValeurAnalyse> getAllValeurs() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ValeurAnalyse> getValeurById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public ValeurAnalyse createValeur(@RequestBody ValeurAnalyse valeurAnalyse) {
        return service.save(valeurAnalyse);
    }

    @PostMapping("/batch")
    public List<ValeurAnalyse> createMultiple(@RequestBody List<ValeurAnalyse> valeurs) {
        return service.saveAll(valeurs);
    }

    @DeleteMapping("/{id}")
    public void deleteValeur(@PathVariable Long id) {
        service.deleteById(id);
    }
}
