package com.example.qep.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Norme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reference;
    private String description;
    private String version;
    private LocalDate datePublication;

    public Norme() {}
    public Norme(Long id, String reference, String description, String version, LocalDate datePublication) {
        this.id = id;
        this.reference = reference;
        this.description = description;
        this.version = version;
        this.datePublication = datePublication;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public LocalDate getDatePublication() {
        return datePublication;
    }
    public void setDatePublication(LocalDate datePublication) {
        this.datePublication = datePublication;
    }
}
