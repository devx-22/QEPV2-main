package com.example.qep.services;

import com.example.qep.entity.ValeurAnalyse;
import com.example.qep.repository.ValeurAnalyseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ValeurAnalyseService {

    @Autowired
    private ValeurAnalyseRepository repository;

    public List<ValeurAnalyse> findAll() {
        return repository.findAll();
    }

    public Optional<ValeurAnalyse> findById(Long id) {
        return repository.findById(id);
    }

    public ValeurAnalyse save(ValeurAnalyse valeurAnalyse) {
        return repository.save(valeurAnalyse);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public List<ValeurAnalyse> saveAll(List<ValeurAnalyse> valeurs) {
        return repository.saveAll(valeurs);
    }
}
