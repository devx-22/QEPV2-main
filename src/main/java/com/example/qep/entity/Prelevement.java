package com.example.qep.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Prelevement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String circuit;
    private String dp;
    private String programme;
    private String type;
    private String date;
    private int planifies;
    private int realises;
    private int termines;

    public Prelevement() {
    }

    public Prelevement(String circuit, String dp, String programme, String type, String date, int planifies, int realises, int termines) {
        this.circuit = circuit;
        this.dp = dp;
        this.programme = programme;
        this.type = type;
        this.date = date;
        this.planifies = planifies;
        this.realises = realises;
        this.termines = termines;
    }

    // Optional: calculated field (not stored in DB)
    @Transient
    public int getAvancement() {
        return planifies == 0 ? 0 : Math.min(100, (int)(((double)termines / planifies) * 100));
    }
}
