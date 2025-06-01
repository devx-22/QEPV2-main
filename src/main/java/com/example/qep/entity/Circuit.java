package com.example.qep.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Circuit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;
    private LocalDate dateCreation;

    @ManyToOne(optional = false)
    @JoinColumn(name = "dp_id", nullable = false)
    private DP dp;

    @ManyToOne(optional = false)
    @JoinColumn(name = "programme_id", nullable = false)
    private Programme programme;

    public Circuit() {}

    public Circuit(long id, String nom, LocalDate dateCreation, DP dp, Programme programme) {
        this.id = id;
        this.nom = nom;
        this.dateCreation = dateCreation;
        this.dp = dp;
        this.programme = programme;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public LocalDate getDateCreation() { return dateCreation; }
    public void setDateCreation(LocalDate dateCreation) { this.dateCreation = dateCreation; }

    public DP getDp() { return dp; }
    public void setDp(DP dp) { this.dp = dp; }

    public Programme getProgramme() { return programme; }
    public void setProgramme(Programme programme) { this.programme = programme; }
}

