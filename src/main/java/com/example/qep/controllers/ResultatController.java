package com.example.qep.controllers;

import com.example.qep.entity.Resultat;
import com.example.qep.repository.ResultatRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resultats")
@CrossOrigin("*")
public class ResultatController {

    private final ResultatRepository repo;

    public ResultatController(ResultatRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Resultat> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Resultat create(@RequestBody Resultat resultat) {
        return repo.save(resultat);
    }

    @GetMapping("/{id}")
    public Resultat getById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Resultat update(@PathVariable Long id, @RequestBody Resultat updated) {
        updated.setId(id);
        return repo.save(updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
