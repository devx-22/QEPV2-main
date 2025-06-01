package com.example.qep.DTO.Response;

public class ParametreResponseDTO {
    private Long id;
    private String nom;
    private String vma;
    private String type;
    private String unite;
    private String norme;
    private String etatAccreditation;

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
    public String getVma() {
        return vma;
    }
    public void setVma(String vma) {
        this.vma = vma;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getUnite() {
        return unite;
    }
    public void setUnite(String unite) {
        this.unite = unite;
    }
    public String getNorme() {
        return norme;
    }
    public void setNorme(String norme) {
        this.norme = norme;
    }
    public String getEtatAccreditation() {
        return etatAccreditation;
    }
    public void setEtatAccreditation(String etatAccreditation) {
        this.etatAccreditation = etatAccreditation;
    }
}
