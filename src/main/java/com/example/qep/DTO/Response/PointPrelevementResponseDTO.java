package com.example.qep.DTO.Response;

public class PointPrelevementResponseDTO {
    private Long id;
    private String adresse;
    private double coordX;
    private double coordY;
    private String codePoint;
    private Long circuitId;
    private String circuitNom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getCircuitId() {
        return circuitId;
    }

    public void setCircuitId(Long circuitId) {
        this.circuitId = circuitId;
    }

    public String getCircuitNom() {
        return circuitNom;
    }

    public void setCircuitNom(String circuitNom) {
        this.circuitNom = circuitNom;
    }
}
