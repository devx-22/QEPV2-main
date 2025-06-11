package com.example.qep.DTO.Response;

import java.time.LocalDate;

public class CircuitResponseDTO {
    private Long id;
    private String nom;
    private LocalDate dateCreation;
    private String dpNom;
    private String programmeNom;
    private String typeAnalyse;
    private int nbPlanifies;
    private int nbRealises;
    private int nbTermines;

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

    public String getProgrammeNom() {
        return programmeNom;
    }

    public void setProgrammeNom(String programmeNom) {
        this.programmeNom = programmeNom;
    }

    public String getTypeAnalyse() {
        return typeAnalyse;
    }

    public void setTypeAnalyse(String typeAnalyse) {
        this.typeAnalyse = typeAnalyse;
    }

    public int getNbPlanifies() {
        return nbPlanifies;
    }

    public void setNbPlanifies(int nbPlanifies) {
        this.nbPlanifies = nbPlanifies;
    }

    public int getNbRealises() {
        return nbRealises;
    }

    public void setNbRealises(int nbRealises) {
        this.nbRealises = nbRealises;
    }

    public int getNbTermines() {
        return nbTermines;
    }

    public void setNbTermines(int nbTermines) {
        this.nbTermines = nbTermines;
    }
}
