package com.example.qep.controllers;

import com.example.qep.entity.Programme;
import com.example.qep.repository.ProgrammeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programmes")
@CrossOrigin(origins = "*")
public class ProgrammeController {

    private final ProgrammeRepository programmeRepository;

    public ProgrammeController(ProgrammeRepository programmeRepository) {
        this.programmeRepository = programmeRepository;
    }

    @GetMapping
    public List<Programme> getAll() {
        return programmeRepository.findAll();
    }

    @PostMapping
    public Programme create(@RequestBody Programme programme) {
        return programmeRepository.save(programme);
    }
}
