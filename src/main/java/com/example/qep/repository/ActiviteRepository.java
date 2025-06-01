package com.example.qep.repository;

import com.example.qep.entity.Activite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ActiviteRepository extends JpaRepository<Activite, Long> {
    Optional<Activite> findByCode(String code);
}
