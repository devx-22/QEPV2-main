package com.example.qep.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pointprelevement")
public class PointPrelevement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String adresse;
    private double coordX;
    private double coordY;
    private String codePoint;
    @ManyToOne(optional = false)
    @JoinColumn(name = "circuit_id", nullable = false)
    private Circuit circuit;

    public PointPrelevement(long id, String adresse, double coordX, double coordY, String codePoint, Circuit circuit) {
        this.id = id;
        this.adresse = adresse;
        this.coordX = coordX;
        this.coordY = coordY;
        this.codePoint = codePoint;
        this.circuit = circuit;
    }
    public PointPrelevement() {}

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public double getCoordX() {
        return coordX;
    }
    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }
    public double getCoordY() {
        return coordY;
    }
    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }
    public String getCodePoint() {
        return codePoint;
    }
    public void setCodePoint(String codePoint) {
        this.codePoint = codePoint;
    }
    public Circuit getCircuit() {
        return circuit;
    }
    public void setCircuit(Circuit circuit) {
        this.circuit = circuit;
    }
}