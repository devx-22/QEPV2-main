package com.example.qep.Service;

import com.example.qep.entity.Circuit;
import com.example.qep.entity.DP;
import com.example.qep.repository.CircuitRepository;
import com.example.qep.repository.DPRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DPService {

    private final DPRepository dpRepository;
    private final CircuitRepository circuitRepository;

    public DPService(DPRepository dpRepository, CircuitRepository circuitRepository) {
        this.dpRepository = dpRepository;
        this.circuitRepository = circuitRepository;
    }

    public List<DP> getAllDPs() {
        return dpRepository.findAll();
    }

    public Optional<DP> getDPById(Long id) {
        return dpRepository.findById(id);
    }

    public DP saveDP(DP dp) {
        return dpRepository.save(dp);
    }

    public DP updateDP(Long id, DP dpDetails) {
        return dpRepository.findById(id)
                .map(dp -> {
                    dp.setNom(dpDetails.getNom());
                    return dpRepository.save(dp);
                }).orElse(null);
    }

    public void deleteDP(Long id) {
        dpRepository.deleteById(id);
    }

    public List<Circuit> getCircuitsByDP(Long dpId) {
        return circuitRepository.findByDpId(dpId);
    }
    public List<DP> saveAllDps(List<DP> dps){
        return dpRepository.saveAll(dps);
    }
}
