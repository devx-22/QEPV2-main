package com.example.qep.repository;

import com.example.qep.entity.ValeurAnalyse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValeurAnalyseRepository extends JpaRepository<ValeurAnalyse, Long> {
}
