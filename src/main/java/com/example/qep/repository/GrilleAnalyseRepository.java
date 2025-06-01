package com.example.qep.repository;

import com.example.qep.entity.GrilleAnalyse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GrilleAnalyseRepository extends JpaRepository<GrilleAnalyse, Long> {
    Optional<GrilleAnalyse> findByCode(String code);
}
