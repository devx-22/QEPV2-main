package com.example.qep.repository;

import com.example.qep.entity.Circuit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface CircuitRepository extends JpaRepository<Circuit, Long> {
    List<Circuit> findByDpId(Long dpId);
}
