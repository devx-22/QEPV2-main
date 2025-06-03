package com.example.qep.repository;

import com.example.qep.entity.Norme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NormeRepository extends JpaRepository<Norme, Long> {
}
