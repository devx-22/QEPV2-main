package com.example.qep.Service;

import com.example.qep.entity.Activite;
import com.example.qep.repository.ActiviteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActiviteService {

    private final ActiviteRepository activiteRepository;

    public ActiviteService(ActiviteRepository activiteRepository) {
        this.activiteRepository = activiteRepository;
    }
    public Activite create(String code) {
        Activite activite = new Activite(code);
        return activiteRepository.save(activite);
    }
    public List<Activite> getAll() {
        return activiteRepository.findAll();
    }
    public Optional<Activite> getById(Long id) {
        return activiteRepository.findById(id);
    }
    public void deleteById(Long id) {
        if (!activiteRepository.existsById(id)) {
            throw new IllegalArgumentException("Activité avec ID " + id + " non trouvée.");
        }
        activiteRepository.deleteById(id);
    }
    public Activite updateById(Long id, String newCode) {
        return activiteRepository.findById(id)
                .map(existing -> {
                    existing.setCode(newCode);
                    return activiteRepository.save(existing);
                })
                .orElseThrow(() -> new IllegalArgumentException("Activité avec ID " + id + " non trouvée."));
    }

}
