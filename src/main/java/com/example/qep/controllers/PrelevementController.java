package com.example.qep.controllers;

import com.example.qep.entity.Prelevement;
import com.example.qep.repository.PrelevementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prelevements")
@CrossOrigin(origins = "http://localhost:4200") // Required for Angular <--> Spring Boot communication
public class PrelevementController {

    @Autowired
    private PrelevementRepository prelevementRepository;

    @GetMapping
    public List<Prelevement> getAll() {
        return prelevementRepository.findAll();
    }

    // Optional: add more endpoints later if needed
}
