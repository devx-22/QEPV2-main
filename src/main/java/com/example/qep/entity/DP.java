package com.example.qep.entity;

import jakarta.persistence.*;

@Entity
public class DP {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;


    public DP(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    public DP() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
