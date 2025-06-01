package com.example.qep.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "analyse_table")
public class Analyse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;  // e.g. "Surveillance", "Reclamation", etc.
    private LocalDate dateAnalyse;

    @ManyToOne(optional = false)
    @JoinColumn(name = "point_id", nullable = false)
    private PointPrelevement pointPrelevement;

    @ManyToOne(optional = false)
    @JoinColumn(name = "grille_id", nullable = false)
    private GrilleAnalyse grilleAnalyse;

    public Analyse() {}

    public Analyse(Long id, String type, LocalDate dateAnalyse, PointPrelevement pointPrelevement, GrilleAnalyse grilleAnalyse) {
        this.id = id;
        this.type = type;
        this.dateAnalyse = dateAnalyse;
        this.pointPrelevement = pointPrelevement;
        this.grilleAnalyse = grilleAnalyse;
    }

    // Getters and Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public LocalDate getDateAnalyse() { return dateAnalyse; }
    public void setDateAnalyse(LocalDate dateAnalyse) { this.dateAnalyse = dateAnalyse; }

    public PointPrelevement getPointPrelevement() { return pointPrelevement; }
    public void setPointPrelevement(PointPrelevement pointPrelevement) { this.pointPrelevement = pointPrelevement; }

    public GrilleAnalyse getGrilleAnalyse() { return grilleAnalyse; }
    public void setGrilleAnalyse(GrilleAnalyse grilleAnalyse) { this.grilleAnalyse = grilleAnalyse; }
}
