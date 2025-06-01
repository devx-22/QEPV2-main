package com.example.qep.DTO.Request;

public class ParametreRequestDTO {
    private String nom;
    private String vma;
    private String type;
    private Long uniteId;
    private Long normeId;
    private Long etatAccreditationId;

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
    public Long getUniteId() {
        return uniteId;
    }
    public void setUniteId(Long uniteId) {
        this.uniteId = uniteId;
    }
    public Long getNormeId() {
        return normeId;
    }
    public void setNormeId(Long normeId) {
        this.normeId = normeId;
    }
    public Long getEtatAccreditationId() {
        return etatAccreditationId;
    }
    public void setEtatAccreditationId(Long etatAccreditationId) {
        this.etatAccreditationId = etatAccreditationId;
    }
}

