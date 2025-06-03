package com.example.qep.repository;

import com.example.qep.entity.EtatAccreditation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatAccreditationRepository extends JpaRepository<EtatAccreditation, Long> {
}
