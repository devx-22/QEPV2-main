package com.example.qep.services;

import com.example.qep.entity.Unite;
import com.example.qep.repository.UniteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UniteService {

    private final UniteRepository repository;

    public UniteService(UniteRepository repository) {
        this.repository = repository;
    }
    public List<Unite> FindAllUnites() {
        return repository.findAll();
    }
    public Optional<Unite> FindUniteById(Long id) {
        return repository.findById(id);
    }
    public Unite SaveUnite(Unite unite) {
        return repository.save(unite);
    }
    public void DeleteUnite(Long id) {
        repository.deleteById(id);
    }
    public List<Unite> SaveAllNormes(List<Unite> unites) {
        return repository.saveAll(unites);
    }
}
