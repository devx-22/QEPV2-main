package com.example.qep.services;

import com.example.qep.entity.Norme;
import com.example.qep.repository.NormeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NormeService {

    private final NormeRepository repository;

    public NormeService(NormeRepository repository) {
        this.repository = repository;
    }

    public List<Norme> findAllNormes() {
        return repository.findAll();
    }

    public Optional<Norme> findNormeById(Long id) {
        return repository.findById(id);
    }

    public Norme saveNorme(Norme norme) {
        return repository.save(norme);
    }

    public void deleteNorme(Long id) {
        repository.deleteById(id);
    }

    public List<Norme> saveAllNormes(List<Norme> normes) {
        return repository.saveAll(normes);
    }
}
