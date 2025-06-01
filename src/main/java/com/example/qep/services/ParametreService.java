package com.example.qep.services;

import com.example.qep.entity.Parametre;
import com.example.qep.repository.ParametreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParametreService {

    @Autowired
    private ParametreRepository parametreRepository;

    public List<Parametre> getAll() {
        return parametreRepository.findAll();
    }

    public Optional<Parametre> getById(Long id) {
        return parametreRepository.findById(id);
    }

    public Parametre save(Parametre parametre) {
        return parametreRepository.save(parametre);
    }

    public void delete(Long id) {
        parametreRepository.deleteById(id);
    }
}
