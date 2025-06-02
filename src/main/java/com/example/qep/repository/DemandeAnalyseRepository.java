package com.example.qep.repository;

import com.example.qep.entity.DemandeAnalyse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandeAnalyseRepository extends JpaRepository<DemandeAnalyse, Long> {
}
