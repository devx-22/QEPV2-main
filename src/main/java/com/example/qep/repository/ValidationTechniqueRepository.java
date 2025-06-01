package com.example.qep.repository;

import com.example.qep.entity.ValidationTechnique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValidationTechniqueRepository extends JpaRepository<ValidationTechnique, Long> {
}
