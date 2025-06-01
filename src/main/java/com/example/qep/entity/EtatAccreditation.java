package com.example.qep.entity;

import jakarta.persistence.*;

@Entity
public class EtatAccreditation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String code;
    private String description;

    public EtatAccreditation() {}
    public EtatAccreditation(Long id, String code, String description) {
        this.id = id;
        this.code = code;
        this.description = description;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
