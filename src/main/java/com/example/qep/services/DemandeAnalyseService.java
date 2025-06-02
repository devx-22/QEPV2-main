package com.example.qep.services;

import com.example.qep.entity.DemandeAnalyse;
import com.example.qep.repository.DemandeAnalyseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemandeAnalyseService {

    @Autowired
    private DemandeAnalyseRepository repository;

    public List<DemandeAnalyse> getAll() {
        return repository.findAll();
    }

    public Optional<DemandeAnalyse> getById(Long id) {
        return repository.findById(id);
    }

    public DemandeAnalyse save(DemandeAnalyse demandeAnalyse) {
        return repository.save(demandeAnalyse);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
