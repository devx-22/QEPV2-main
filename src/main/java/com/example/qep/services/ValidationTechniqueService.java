package com.example.qep.services;

import com.example.qep.entity.ValidationTechnique;
import com.example.qep.repository.ValidationTechniqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ValidationTechniqueService {

    @Autowired
    private ValidationTechniqueRepository repository;

    public List<ValidationTechnique> findAll() {
        return repository.findAll();
    }

    public Optional<ValidationTechnique> findById(Long id) {
        return repository.findById(id);
    }

    public ValidationTechnique save(ValidationTechnique technique) {
        return repository.save(technique);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public List<ValidationTechnique> saveAll(List<ValidationTechnique> techniques) {
        return repository.saveAll(techniques);
    }
}
