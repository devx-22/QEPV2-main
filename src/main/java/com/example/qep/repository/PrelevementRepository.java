package com.example.qep.repository;

import com.example.qep.entity.Prelevement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrelevementRepository extends JpaRepository<Prelevement, Long> {
}
