package com.example.qep.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Programme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String type;
    private LocalDate dateCreation;

    @OneToMany(mappedBy = "programme", cascade = CascadeType.ALL)
    private List<Circuit> circuits;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public LocalDate getDateCreation() { return dateCreation; }
    public void setDateCreation(LocalDate dateCreation) { this.dateCreation = dateCreation; }

    public List<Circuit> getCircuits() { return circuits; }
    public void setCircuits(List<Circuit> circuits) { this.circuits = circuits; }
}
