package com.example.qep.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "valeur_analyse")
public class ValeurAnalyse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valeur;

    @ManyToOne
    @JoinColumn(name = "analyse_id")
    private Analyse analyse;

    @ManyToOne
    @JoinColumn(name = "parametre_id")
    private Parametre parametre;

    public ValeurAnalyse() {}

    public ValeurAnalyse(Long id, Double valeur, Analyse analyse, Parametre parametre) {
        this.id = id;
        this.valeur = valeur;
        this.analyse = analyse;
        this.parametre = parametre;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Double getValeur() { return valeur; }
    public void setValeur(Double valeur) { this.valeur = valeur; }

    public Analyse getAnalyse() { return analyse; }
    public void setAnalyse(Analyse analyse) { this.analyse = analyse; }

    public Parametre getParametre() { return parametre; }
    public void setParametre(Parametre parametre) { this.parametre = parametre; }
}
