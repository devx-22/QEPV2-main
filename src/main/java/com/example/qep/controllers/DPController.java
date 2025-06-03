package com.example.qep.controllers;

import com.example.qep.entity.Circuit;
import com.example.qep.entity.DP;
import com.example.qep.Service.DPService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/dps")
public class DPController {

    private final DPService dpService;

    public DPController(DPService dpService) {
        this.dpService = dpService;
    }

    @GetMapping
    public ResponseEntity<List<DP>> getAll() {
        return ResponseEntity.ok(dpService.getAllDPs());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<DP>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(dpService.getDPById(id));
    }

    @PostMapping
    public ResponseEntity<DP> create(@RequestBody DP dp) {
        return ResponseEntity.ok(dpService.saveDP(dp));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DP> update(@PathVariable Long id, @RequestBody DP dp) {
        return ResponseEntity.ok(dpService.updateDP(id, dp));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        dpService.deleteDP(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}/circuits")
    public ResponseEntity<List<Circuit>> getCircuitsByDp(@PathVariable Long id) {
        return ResponseEntity.ok(dpService.getCircuitsByDP(id));
    }
    @PostMapping("/saveAll")
    public ResponseEntity<List<DP>> createAll(@RequestBody List<DP> dps) {
        return ResponseEntity.ok(dpService.saveAllDps(dps));
    }
}
