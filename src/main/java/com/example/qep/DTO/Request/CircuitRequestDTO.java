package com.example.qep.DTO.Request;

import java.time.LocalDate;

public class CircuitRequestDTO {
    private String nom;
    private LocalDate dateCreation;
    private Long dpId;

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
    public Long getDpId() {
        return dpId;
    }
    public void setDpId(Long dpId) {
        this.dpId = dpId;
    }
}
