package com.example.qep.Service;

import com.example.qep.entity.EtatAccreditation;
import com.example.qep.repository.EtatAccreditationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtatAccreditationService {

    private final EtatAccreditationRepository repository;

    public EtatAccreditationService(EtatAccreditationRepository repository) {
        this.repository = repository;
    }
    public List<EtatAccreditation> FindAllEtatAccreditation() {
        return repository.findAll();
    }
    public Optional<EtatAccreditation> FindEtatAccreditationById(Long id) {
        return repository.findById(id);
    }
    public EtatAccreditation SaveEtatAccreditation(EtatAccreditation entity) {
        return repository.save(entity);
    }
    public void DeleteEtatAccreditation(Long id) {
        repository.deleteById(id);
    }
    public List<EtatAccreditation> SaveAllNormes(List<EtatAccreditation> etatAccreditations) {
        return repository.saveAll(etatAccreditations);
    }

}
