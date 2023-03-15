package com.service.RH.repository;

import com.service.RH.model.Paie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaieRepository extends JpaRepository<Paie, Long> {
}
