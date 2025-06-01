package com.example.qep.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class GrilleAnalyse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String code;

    @ManyToMany
    private List<Parametre> parametres;

    public GrilleAnalyse() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public List<Parametre> getParametres() { return parametres; }
    public void setParametres(List<Parametre> parametres) { this.parametres = parametres; }
}
