package com.example.qep.services;

import com.example.qep.entity.Analyse;
import com.example.qep.repository.AnalyseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnalyseService {

    @Autowired
    private AnalyseRepository analyseRepository;

    public List<Analyse> getAllAnalyses() {
        return analyseRepository.findAll();
    }

    public Optional<Analyse> getAnalyseById(Long id) {
        return analyseRepository.findById(id);
    }

    public Analyse createAnalyse(Analyse analyse) {
        return analyseRepository.save(analyse);
    }

    public void deleteAnalyse(Long id) {
        analyseRepository.deleteById(id);
    }
}
