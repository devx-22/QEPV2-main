package com.example.qep.repository;

import com.example.qep.entity.PointPrelevement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface PointPrelevementRepository extends JpaRepository<PointPrelevement, Long> {
    List<PointPrelevement> findByCircuitId(Long circuitId);
}
