package com.example.qep.DTO.Response;

import java.time.LocalDate;

public class CircuitResponseDTO {
    private Long id;
    private String nom;
    private LocalDate dateCreation;
    private String dpNom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getDpNom() {
        return dpNom;
    }

    public void setDpNom(String dpNom) {
        this.dpNom = dpNom;
    }
}
