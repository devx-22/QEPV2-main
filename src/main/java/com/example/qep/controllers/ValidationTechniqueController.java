package com.example.qep.controllers;

import com.example.qep.entity.ValidationTechnique;
import com.example.qep.services.ValidationTechniqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/validation-techniques")
@CrossOrigin(origins = "*")
public class ValidationTechniqueController {

    @Autowired
    private ValidationTechniqueService service;

    @GetMapping
    public List<ValidationTechnique> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ValidationTechnique> getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public ValidationTechnique create(@RequestBody ValidationTechnique technique) {
        return service.save(technique);
    }

    @PutMapping("/{id}")
    public ValidationTechnique update(@PathVariable Long id, @RequestBody ValidationTechnique technique) {
        technique.setId(id);
        return service.save(technique);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}
