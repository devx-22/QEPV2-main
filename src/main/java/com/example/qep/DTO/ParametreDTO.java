package com.example.qep.DTO;

public class ParametreDTO {
    private String nom;
    private String unite;

    public ParametreDTO() {}

    public ParametreDTO(String nom, String unite) {
        this.nom = nom;
        this.unite = unite;
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getUnite() { return unite; }
    public void setUnite(String unite) { this.unite = unite; }
}
