package com.example.qep.repository;

import com.example.qep.entity.DP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DPRepository extends JpaRepository<DP, Long> {}
