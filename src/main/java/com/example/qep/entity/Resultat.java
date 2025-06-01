package com.example.qep.entity;

import jakarta.persistence.*;

@Entity
public class Resultat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valeur;

    @ManyToOne(optional = false)
    @JoinColumn(name = "analyse_id")
    private Analyse analyse;

    @ManyToOne(optional = false)
    @JoinColumn(name = "parametre_id")
    private Parametre parametre;

    public Resultat() {}

    public Resultat(Long id, Double valeur, Analyse analyse, Parametre parametre) {
        this.id = id;
        this.valeur = valeur;
        this.analyse = analyse;
        this.parametre = parametre;
    }

    // Getters and setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Double getValeur() { return valeur; }
    public void setValeur(Double valeur) { this.valeur = valeur; }

    public Analyse getAnalyse() { return analyse; }
    public void setAnalyse(Analyse analyse) { this.analyse = analyse; }

    public Parametre getParametre() { return parametre; }
    public void setParametre(Parametre parametre) { this.parametre = parametre; }
}
