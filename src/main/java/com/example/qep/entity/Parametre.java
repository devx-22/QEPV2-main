package com.example.qep.entity;

import jakarta.persistence.*;

@Entity
public class Parametre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String vma;
    @Enumerated(EnumType.STRING)
    private TypeParametre type;
    @ManyToOne(optional = false)
    private Unite unite;
    @ManyToOne(optional = false)
    private Norme norme;
    @ManyToOne(optional = false)
    private EtatAccreditation etatAccreditation;

    public Parametre() {}
    public Parametre(Long id, String nom, String vma, TypeParametre type, Unite unite, Norme norme, EtatAccreditation etatAccreditation) {
        this.id = id;
        this.nom = nom;
        this.vma = vma;
        this.type = type;
        this.unite = unite;
        this.norme = norme;
        this.etatAccreditation = etatAccreditation;
    }
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
    public TypeParametre getType() {
        return type;
    }
    public void setType(TypeParametre type) {
        this.type = type;
    }
    public Norme getNorme() {
        return norme;
    }
    public void setNorme(Norme norme) {
        this.norme = norme;
    }
    public EtatAccreditation getEtatAccreditation() {
        return etatAccreditation;
    }
    public void setEtatAccreditation(EtatAccreditation etatAccreditation) {
        this.etatAccreditation = etatAccreditation;
    }
    public Unite getUnite() {
        return unite;
    }
    public void setUnite(Unite unite) {
        this.unite = unite;
    }
}
