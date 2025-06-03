package com.example.qep.controllers;

import com.example.qep.entity.Norme;
import com.example.qep.services.NormeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/normes")

public class NormeController {

    private final NormeService normeService;

    public NormeController(NormeService normeService) {
        this.normeService = normeService;
    }

    @GetMapping
    public List<Norme> getAllNormes() {
        return normeService.findAllNormes();
    }

    @GetMapping("/{id}")
    public Optional<Norme> getNormeById(@PathVariable Long id) {
        return normeService.findNormeById(id);
    }

    @PostMapping
    public Norme createNorme(@RequestBody Norme norme) {
        return normeService.saveNorme(norme);
    }

    @DeleteMapping("/{id}")
    public void deleteNorme(@PathVariable Long id) {
        normeService.deleteNorme(id);
    }
}
