package com.example.qep.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class DemandeAnalyse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateDemande;
    private String creerPar;
    private String commentaire;

    @ManyToOne
    @JoinColumn(name = "activite_id")
    private Activite activite;

    public DemandeAnalyse() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getDateDemande() { return dateDemande; }
    public void setDateDemande(LocalDate dateDemande) { this.dateDemande = dateDemande; }

    public String getCreerPar() { return creerPar; }
    public void setCreerPar(String creerPar) { this.creerPar = creerPar; }

    public String getCommentaire() { return commentaire; }
    public void setCommentaire(String commentaire) { this.commentaire = commentaire; }

    public Activite getActivite() { return activite; }
    public void setActivite(Activite activite) { this.activite = activite; }
}
