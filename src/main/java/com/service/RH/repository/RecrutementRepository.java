package com.service.RH.repository;

import com.service.RH.model.Recrutement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecrutementRepository  extends JpaRepository<Recrutement, Long> {
}
